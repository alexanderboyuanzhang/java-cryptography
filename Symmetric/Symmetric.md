# Java - Symmetric-Key Cryptography example
Edited by Boyuan Zhang

Symmetric-Key Cryptography is an encryption system in which the same key is used for the encoding and decoding of the data. The safe distribution of the key is one of the drawbacks of this method, but what it lacks in security it gains in time complexity.

One should always assume that the encryption algorithms are publicly known and not rely on “Security through obscurity”. The most popular Symmetric Algorithms are DES, Triple-DES, AES, Blowfish, RC2, RC4(ARCFOUR), RC5, RC6.

## 1. Use Case of Symmetric Key Cryptography

Below you can see the code of an application that uses Symmetric-Key Cryptography to encrypt or decrypt a pre-set directory. The constructor is initialized with the password, the length of the key and the algorithm that will be used for the cipher. 

In this example we use AES as it is considered the silver lining between speed and security.

`SymmetricKeyExample.java`

## Reference

[![Symmetric Key - mkyong](https://www.mkyong.com/java/java-symmetric-key-cryptography-example/?utm_source=mkyong.com&utm_medium=Referral&utm_campaign=afterpost-related&utm_content=link1)]