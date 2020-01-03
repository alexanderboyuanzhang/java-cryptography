package com.bzhang.security.cryptography.md.sha.medium;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
//import java.util.Arrays;

public class SHAExample {

	public static void main(String[] args) throws NoSuchAlgorithmException {
		String passwordToHash = "password";
		byte[] salt = getSalt();

//		System.out.println("Salt values: " + Arrays.toString(salt));

		String securePassword = get_SHA_1_SecurePassword(passwordToHash, salt);
		System.out.println(securePassword);

		securePassword = get_SHA_256_SecurePassword(passwordToHash, salt);
		System.out.println(securePassword);

		securePassword = get_SHA_384_SecurePassword(passwordToHash, salt);
		System.out.println(securePassword);

		securePassword = get_SHA_512_SecurePassword(passwordToHash, salt);
		System.out.println(securePassword);
	}

	private static String get_SHA_1_SecurePassword(String passwordToHash, byte[] salt) {
		String generatedPassword = null;
		try {
			MessageDigest md = MessageDigest.getInstance("SHA-1");
			md.update(salt);
			byte[] bytes = md.digest(passwordToHash.getBytes());
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < bytes.length; i++) {
				sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
			}
			generatedPassword = sb.toString();
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		return generatedPassword;
	}

	private static String get_SHA_256_SecurePassword(String passwordToHash, byte[] salt) {
		// Use MessageDigest md = MessageDigest.getInstance("SHA-256");
		return getSecurePassword(passwordToHash, salt, "SHA-256");
	}

	private static String get_SHA_384_SecurePassword(String passwordToHash, byte[] salt) {
		// Use MessageDigest md = MessageDigest.getInstance("SHA-384");
		return getSecurePassword(passwordToHash, salt, "SHA-384");
	}

	private static String get_SHA_512_SecurePassword(String passwordToHash, byte[] salt) {
		// Use MessageDigest md = MessageDigest.getInstance("SHA-512");
		return getSecurePassword(passwordToHash, salt, "SHA-512");
	}

	private static String getSecurePassword(String passwordToHash, byte[] salt, String mdStr) {
		String generatedPassword = null;
		try {
			// Create MessageDigest instance for MD5
			MessageDigest md = MessageDigest.getInstance(mdStr);
			// Add password bytes to digest
			md.update(salt);
			// Get the hash's bytes
			byte[] bytes = md.digest(passwordToHash.getBytes());
			// This bytes[] has bytes in decimal format;
			// Convert it to hexadecimal format
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < bytes.length; i++) {
				sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
			}
			// Get complete hashed password in hex format
			generatedPassword = sb.toString();
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		return generatedPassword;
	}

	// Add salt
	private static byte[] getSalt() throws NoSuchAlgorithmException {
		SecureRandom sr = SecureRandom.getInstance("SHA1PRNG");
		byte[] salt = new byte[16];
		sr.nextBytes(salt);
		return salt;
	}
}