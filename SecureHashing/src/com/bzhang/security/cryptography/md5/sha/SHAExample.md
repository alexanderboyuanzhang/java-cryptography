# Medium password security using SHA algorithms
Edited by Boyuan Zhang

The SHA (Secure Hash Algorithm) is a family of cryptographic hash functions. It is very similar to MD5 except it generates more strong hashes. However these hashes are not always unique, and it means that for two different inputs we could have equal hashes. When this happens it�s called a �collision�. Chances of collision in SHA is less than MD5. But, do not worry about these collisions because they are really very rare.

Java has 4 implementations of SHA algorithm. They generate the following length hashes in comparison to MD5 (128-bit hash):

* **SHA-1** (Simplest one � 160 bits Hash)
* **SHA-256** (Stronger than SHA-1 � 256 bits Hash)
* **SHA-384** (Stronger than SHA-256 � 384 bits Hash)
* **SHA-512** (Stronger than SHA-384 � 512 bits Hash)

A longer hash is more difficult to break. That�s the core idea.

To get any implementation of algorithm, pass it as parameter to MessageDigest. e.g.

	MessageDigest md = MessageDigest.getInstance("SHA-1");

	//OR

	MessageDigest md = MessageDigest.getInstance("SHA-256");

## Java SHA Hashing Example

	SHAExample.java

Very easily we can say that SHA-512 generates strongest Hash.


## Reference

[![Medium password security using SHA algorithms | HowToDoInJava](https://howtodoinjava.com/security/how-to-generate-secure-password-hash-md5-sha-pbkdf2-bcrypt-examples/#sha)]
