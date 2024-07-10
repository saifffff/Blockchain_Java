import java.security.MessageDigest;

public class StringUtil {
  // the purpose of this class is to apply SHA-256 to a string and returns at
  // result

  public static String applySha256(String input) {

    try {
      MessageDigest digest = MessageDigest.getInstance("SHA-256");
      // MessageDigest is a class that provides functionality for working with message
      // digest algorithms, also known as hashing algorithms. These algorithms are
      // one-way functions that take input data of any size and generate a
      // fixed-length output value, called a message digest or hash value.
      byte[] hash = digest.digest(input.getBytes("UTF-8"));
      // returns a byte array of the hash

      StringBuffer hexString = new StringBuffer(); // generating a hexadecimal code string
      for (int i = 0; i < hash.length; i++) {
        String hex = Integer.toHexString(0xff & hash[i]);
        if (hex.length() == 1) {
          hexString.append('0');
        }
        hexString.append(hex);
      }

      return hexString.toString();

    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

}