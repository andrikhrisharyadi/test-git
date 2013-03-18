package telkomsigma.itbroadband.util;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.springframework.security.crypto.password.StandardPasswordEncoder;

public class Encryptors {

	public static String sha256(String plainText) {
		return bytesToString(encrypt("SHA-256", plainText.getBytes()));
	}

	private static byte[] encrypt(String algorithm, byte[] bytes) {
		try {
			MessageDigest md = MessageDigest.getInstance(algorithm);
			return md.digest(bytes);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}

		return null;
	}

	private static String bytesToString(byte[] bytes) {
		return new BigInteger(1, bytes).toString(16);
	}

	public static void main(String[] args) {
		System.out.println(sha256("admin"));

		StandardPasswordEncoder encoder = new StandardPasswordEncoder("1tBro4DbanD");

		String encodedPassword = encoder.encode("mimin");
		System.out.println(encodedPassword);

		System.out.println(encoder.matches("miminPwd", "8995a6968d5ac1d454723b0fdb18cd82abf2a12cbeb54b99c3ff9ff33cad6eae35b16344f4ead1dc"));
	}
}
