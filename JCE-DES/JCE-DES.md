# JCE Encryption - DES
Edited by Boyuan Zhang


This article shows how to use **Java Cryptography Extension (JCE)** to encrypt or decrypt a a text via DES mechanism. 

## 1. DES Key

Create a DES Key.

	KeyGenerator keygenerator = KeyGenerator.getInstance("DES");
	SecretKey myDesKey = keygenerator.generateKey();

## 2. Cipher Info

Create a Cipher instance from Cipher class, specify the following information and separated by a slash (/).

* Algorithm name
* Mode (optional)
* Padding scheme (optional)

	Cipher desCipher;
	// Create the cipher
	desCipher = Cipher.getInstance("DES/ECB/PKCS5Padding");

### Note 

DES = Data Encryption Standard.
ECB = Electronic Codebook mode.
PKCS5Padding = PKCS #5-style padding.

In this case, we created a DES cipher in Electronic Codebook mode, with PKCS #5-style padding.

## 3. Convert It

Convert String into Byte[] array format.

	byte[] text = "Nobody can see me".getBytes();
	
## 4. Encrypt It

Make Cipher in encrypt mode, and encrypt it with **Cipher.doFinal()** method.

	desCipher.init(Cipher.ENCRYPT_MODE, myDesKey);
	byte[] textEncrypted = desCipher.doFinal(text);
	
## 5. Decrypt It 

Make Cipher in decrypt mode, and decrypt it with **Cipher.doFinal()** method as well.
	
	desCipher.init(Cipher.DECRYPT_MODE, myDesKey);
	byte[] textDecrypted = desCipher.doFinal(textEncrypted);
	
## 6. Java Class

	JEncryption.java

## References 

[![Java Cryptography Architecture | API Specification & Reference](https://docs.oracle.com/javase/1.5.0/docs/guide/security/CryptoSpec.html)]

[![JCE Encryption - DES Tutorial](https://www.mkyong.com/java/jce-encryption-data-encryption-standard-des-tutorial/?utm_source=mkyong.com&utm_medium=Referral&utm_campaign=afterpost-related&utm_content=link0)]