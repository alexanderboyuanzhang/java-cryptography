# Advanced password security using PBKDF2WithHmacSHA1 algorithm

So far we learned about creating secure hashes for password, and using salt to make it even more secure. But the problem today is that hardwares have become so much fast that any brute force attack using dictionary and rainbow tables, any password can be cracked in some less or more time.

To solve this problem, general idea is to **make brute force attack slower** so that damage can be minimized. Our next algorithm, works on this very concept. The goal is to make the hash function slow enough to impede attacks, but still fast enough to not cause a noticeable delay for the user.

This feature is essentially implemented using some **CPU intensive algorithms** such as **PBKDF2**, Bcrypt or Scrypt. These algorithms take a work factor (also known as security factor) or iteration count as an argument. This value determines how slow the hash function will be. When computers become faster next year we can increase the work factor to balance it out.

Java has implementation of “[![PBKDF2](https://en.wikipedia.org/wiki/PBKDF2)]” 
algorithm as “[![PBKDF2WithHmacSHA1](https://docs.oracle.com/javase/7/docs/technotes/guides/security/StandardNames.html#SecretKeyFactory)]”.


## Java PBKDF2WithHmacSHA1 Hash Example

	PBKDF2WithHmacSHA1.java

to be continued...



## Reference 

[![Advanced password security using PBKDF2WithHmacSHA1 algorithm | HowToDoInJava](https://howtodoinjava.com/security/how-to-generate-secure-password-hash-md5-sha-pbkdf2-bcrypt-examples/#PBKDF2WithHmacSHA1)]