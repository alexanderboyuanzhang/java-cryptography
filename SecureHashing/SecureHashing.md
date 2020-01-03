# Java Secure Hashing – MD5, SHA256, SHA512, PBKDF2, BCrypt, SCrypt
Edited by Boyuan Zhang

Learn Java Secure Hashing algorithms in-depth. A **secure password hash** is an encrypted sequence of characters obtained after applying certain algorithms and manipulations on user-provided password, which are generally very weak and easy to guess.

There are many such hashing algorithms in Java which can prove really effective for password security.

**Note:**
Please remember that once this password hash is generated and stored in the database, you can not convert it back to the original password.

Each time user login into the application, you have to regenerate password hash again and match with the hash stored in the database. So, if the user forgot his/her password, you will have to send him a temporary password and ask him to change it with his new password. It’s common nowadays, right?




## Reference

[![Java Secure Hashing | HowToDoInJava](https://howtodoinjava.com/security/how-to-generate-secure-password-hash-md5-sha-pbkdf2-bcrypt-examples/#md5)]