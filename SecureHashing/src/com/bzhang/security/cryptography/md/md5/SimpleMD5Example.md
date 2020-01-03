# Simple password security using MD5 algorithm
Edited by Boyuan Zhang

The [![MD5 Message-Digest Algorithm](https://en.wikipedia.org/wiki/MD5)]
is a widely used 
[![cryptographic hash function](https://en.wikipedia.org/wiki/Cryptographic_hash_function)]
that produces a 128-bit (16-byte) hash value. It’s very simple and straight forward; the basic idea is to map data sets of variable length to data sets of a fixed length.

In order to do this, the input message is split into chunks of 512-bit blocks. A padding is added to the end so that it’s length can be divided by 512. Now, these blocks are processed by the **MD5 algorithm**, which operates in a 128-bit state, and the result will be a 128-bit hash value. After applying MD5, generated hash is typically a 32-digit hexadecimal number.

Here, the password to be encoded is often called the “**message**” and the generated hash value is called the **message digest** or simply “**digest**”.

	SimpleMD5Example.java

Although MD5 is a widely spread hashing algorithm, it is far from being secure, MD5 generates fairly weak hashes. It’s main advantages are that it is fast, and easy to implement. But it also means that it is susceptible to *brute-force* and *dictionary* attacks.

*Rainbow tables* with words and hashes generated allows searching very quickly for a known hash and getting the original word.

MD5 is **not collision resistant** which means that different passwords can eventually result in the same hash.

Today, if you are using MD5 hash in your application then consider adding some **salt** to your security.

## Reference

[![Simple password security using MD5 algorithm | HowToDoInJava](https://howtodoinjava.com/security/how-to-generate-secure-password-hash-md5-sha-pbkdf2-bcrypt-examples/#md5)]