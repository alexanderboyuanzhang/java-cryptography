# Java – Asymmetric Cryptography example

Edited by Boyuan Zhang

Asymmetric Cryptography, also known as Public Key Cryptography, is an encryption system in which two different but uniquely related cryptographic keys are used. The data encrypted using one key can be decrypted with the other. These keys are known as Public and Private Key Pair, and as the name implies the private key must remain private while the public key can be distributed. The most popular Public Key Algorithms are RSA, Diffie-Hellman, ElGamal, DSS.

## 1. Generate a Public-Private Key Pair

There are several ways to generate a Public-Private Key Pair depending on your platform. In this example, we will create a pair using Java. The Cryptographic Algorithm we will use in this example is RSA.

`GenerateKeys.java`

this class will generate two files. `privateKey` and `publicKey`

## 2. Create a text file to encrypt

for example namely the file `text.txt`

## 3. Use the Key Pair to encrypt and decrypt data

In this example, we create a class that can load the Public and the Private keys from their files and then uses them to encrypt and decrypt a String and a File. To run this example, you need to have run the code above to generate keys.

### Note
You need to get 
[![Apache Commons Codec](https://mvnrepository.com/artifact/commons-codec/commons-codec/1.9)]
and add it to the program

`AsymmetricCryptography.java` 

## Reference

[![Java - Asymmetric Cryptography | Mkyong](https://www.mkyong.com/java/java-asymmetric-cryptography-example/)]