# Hybrid Cryptography
Edited by Boyuan Zhang

Hybrid Cryptography is the silver lining between safe, but slow cryptography over big data (Asymmetric Cryptography) and unsafe but fast cryptography (Symmetric Cryptography). Hybrid Cryptography combines the speed of One-Key encryption and decryption along with the security that the Public-Private Key pair provides and thus considered a highly secure type of encryption.

The most common methodology for Hybrid Cryptography is to encrypt the data using a Symmetric Key which will be then encrypted with the Private Key of the sender or the Public Key of the receiver. To decrypt, the receiver, will have to first decrypt the Symmetric key using the corresponding Asymmetric Key and then use that Symmetric Key to decrypt the data they received. This example might help clarify that:

Imagine a scenario with two users, Alice and Bob, who have already exchanged Public Keys. Alice wants to send Bob a text file called “confidential.txt”. The steps she will follow to encrypt her message are the following:
1. Generates a new Symmetric Key using a strong algorithm
2. Encrypts “confidential.txt” using the Key from step 1
3. Encrypts the Key from step 1 using Bob’s Public Key
4. Sends both the encrypted text and the key to Bob

Bob receives the two files. The steps he will follow to decrypt them are the following:

1. Decrypts the Key he received using his own Private Key
2. Decrypts the text he received using the Key he got in step 1 after the decryption

**Note**
If you want to read more about Symmetric and Asymmetric Encryption 


## Reference

[![Java - Hybrid Cryptography example | Mkyong](https://www.mkyong.com/java/java-hybrid-cryptography-example/?utm_source=mkyong.com&utm_medium=Referral&utm_campaign=afterpost-related&utm_content=link1)]