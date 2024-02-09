import java.io.*;
import javax.crypto.*;
import javax.crypto.spec.*;

public class fileEncryption {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the file path: ");
            String filePath = br.readLine();
            System.out.println("Enter 'E' to encrypt or 'D' to decrypt: ");
            String mode = br.readLine();

            KeyGenerator keygenerator = KeyGenerator.getInstance("DES");
            SecretKey myDesKey = keygenerator.generateKey();

            Cipher desCipher;
            desCipher = Cipher.getInstance("DES");

            FileInputStream fis = new FileInputStream(filePath);
            byte[] inputBytes = new byte[(int) fis.available()];
            fis.read(inputBytes);

            if (mode.equalsIgnoreCase("E")) {
                desCipher.init(Cipher.ENCRYPT_MODE, myDesKey);
            } else if (mode.equalsIgnoreCase("D")) {
                desCipher.init(Cipher.DECRYPT_MODE, myDesKey);
            } else {
                System.out.println("Invalid mode. Please enter 'E' or 'D'.");
                return;
            }

            byte[] outputBytes = desCipher.doFinal(inputBytes);

            String outputFilePath;
            if (mode.equalsIgnoreCase("E")) {
                outputFilePath = filePath + ".encrypted";
            } else {
                outputFilePath = filePath + ".decrypted";
            }

            FileOutputStream fos = new FileOutputStream(outputFilePath);
            fos.write(outputBytes);

            fis.close();
            fos.close();

            System.out.println("File " + filePath + " has been " + mode.toLowerCase() + "ed and saved to " + outputFilePath + ".");
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
