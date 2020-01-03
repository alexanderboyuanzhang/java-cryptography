# Making MD5 more secure using salt
Edited by Boyuan Zhang

Keep in mind, adding salt is not MD5 specific. You can add it to other algorithms also. So, please focus on how it is applied rather than its relation with MD5.


Wikipedia defines salt as **random data that are used as an additional input to a one-way function that hashes a password or pass-phrase**. In more simple words, salt is some randomly generated text, which is appended to the password before obtaining hash.

The original intent of salting was primarily to defeat pre-computed rainbow table attacks that could otherwise be used to greatly improve the efficiency of cracking the hashed password database. A greater benefit now is to slow down parallel operations that compare the hash of a password guess against many password hashes at once.

**Important**: We always need to use a SecureRandom to create good salts, and in Java, the SecureRandom class supports the “SHA1PRNG” pseudo random number generator algorithm, and we can take advantage of it.

## How to generate Salt for Hash

Let’s see how salt should be generated.

	private static byte[] getSalt() throws NoSuchAlgorithmException{
	    //Always use a SecureRandom generator
	    SecureRandom sr = SecureRandom.getInstance("SHA1PRNG");
	    //Create array for salt
	    byte[] salt = new byte[16];
	    //Get a random salt
	    sr.nextBytes(salt);
	    //return salt
	    return salt;
	}

**SHA1PRNG** algorithm is used as cryptographically strong pseudo-random number generator based on the SHA-1 message digest algorithm. Note that if a seed is not provided, it will generate a seed from a true random number generator (**TRNG**).

## Java MD5 with salt example

	SaltedMD5Example.java
	
**Important**: Please note that now you have to **store this salt value for every password you hash**. Because when user login back in system, you must use only originally generated salt to again create the hash to match with stored hash. If a different salt is used (we are generating random salt), then generated hash will be different.

Also, you might heard of term **crazy hashing and salting**. It generally refer to creating custom combinations.

**Crazy hashing and saltings example**

	alt+password+salt => hash

Do not practice these crazy things. They do not help in making hashes further secure anyhow. If you want more security, choose a better algorithm.


## Reference 

[![Making MD5 more secure using salt | HowToDoInJava](https://howtodoinjava.com/security/how-to-generate-secure-password-hash-md5-sha-pbkdf2-bcrypt-examples/#md5-salt)]

