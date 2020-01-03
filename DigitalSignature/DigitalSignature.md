# Digital Signatures

Edited by Boyuan Zhang

From Asymmetric Cryptography we learned the usage of Public Key Pair in Cryptography. 
Another important use of the Public Key Infrastructure is in Digital Signatures. 
Digital Signatures are the digital equivalent of handwritten signatures with one important difference; they are not unique but come as a product of the message.


A valid digital signature gives a recipient reason to believe that the message was created by a known sender (**authentication**), that the sender cannot deny having sent the message (**non-repudiation**), and that the message was not altered in transit (**integrity**). 
(Source: 
[![Wikipedia](https://en.wikipedia.org/wiki/Digital_signature)])

## 1. Generate a Public-Private Key Pair

	GenerateKeys.java

## 2. Sign the message

Next we have to write our message and then sign it. The message and the signature can be separate files but in our example we add them to a List of byte[] and write them as Object to the file.

	Message.java
	
## 3. Verify the Signature

The receiver has the file (he knows it is a List of 2 byte arrays; the message and the signature) and wants to verify that the message comes from the expected source with a pre-shared Public Key.

	VerifyMessage.java
	



## Reference 

[![Java - Digital Signature | Mkyong ](https://www.mkyong.com/java/java-digital-signatures-example/?utm_source=mkyong.com&utm_medium=Referral&utm_campaign=afterpost-related&utm_content=link4)]