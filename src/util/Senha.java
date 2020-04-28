package util;
import java.io.InvalidObjectException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Base64;
        
public class Senha {

    private static String encode(byte[] bytes) {
        return Base64.getEncoder().encodeToString(bytes);
    }

    private static byte[] decode(String encoded) {
        return Base64.getDecoder().decode(encoded);
    }

    private static byte[] generateSalt() {
        SecureRandom random = new SecureRandom();
        byte[] bytes = new byte[16];
        random.nextBytes(bytes);
        return bytes;
    }

    /**
     * Hashes a password + a random salt using sha512
     *
     * @param password
     * @return a hash with the following format:
     * base64(salt):base64(sha512(password+salt))
     * @throws java.security.NoSuchAlgorithmException if cannot find sha512
     * algorithm
     */
    public static String digest(String password) throws NoSuchAlgorithmException {
        return Senha.digest(password, generateSalt());
    }

    /**
     * Hashes a password + salt using sha512
     *
     * @param password
     * @param salt
     * @return a hash with the following format:
     * base64(salt):base64(sha512(password+salt))
     * @throws java.security.NoSuchAlgorithmException if cannot find sha512
     * algorithm
     */
    public static String digest(String password, byte[] salt) throws NoSuchAlgorithmException {
        return encode(salt) + ":" + encode(digest(password.getBytes(StandardCharsets.UTF_8), salt));
    }

    /**
     * Hashes a password + salt using sha512
     *
     * @param password
     * @param salt
     * @return a hash with the following format:
     * base64(salt):base64(sha512(password+salt))
     * @throws java.security.NoSuchAlgorithmException if cannot find sha512
     * algorithm
     */
    public static byte[] digest(byte[] password, byte[] salt) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("SHA-512");
        md.update(salt);
        return md.digest(password);
    }

    /**
     * Extract the salt bytes from a hash
     *
     * @param hash
     * @return the stracted salt as a byte[]
     * @throws InvalidObjectException if the hash is invalid
     */
    private static byte[] extractSalt(String hash) throws InvalidObjectException {
        String[] parts = hash.split(":");
        if (parts.length != 2) {
            throw new InvalidObjectException("Invalid hash: " + hash);
        }
        return decode(parts[0]);
    }

    /**
     * Verify if password matches hash
     *
     * @param password
     * @param hash
     * @return true if matches
     * @throws InvalidObjectException if the hash is invalid
     * @throws NoSuchAlgorithmException if cannot found sha512 algorithm
     */
    public static boolean match(String password, String hash) throws InvalidObjectException, NoSuchAlgorithmException {
        byte[] salt = extractSalt(hash);
        String password_hash = digest(password, salt);

        return hash.equals(password_hash);
    }

}
