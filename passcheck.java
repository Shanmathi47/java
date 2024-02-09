import java.util.Scanner;

public class passcheck{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a password: ");
        String password = scanner.nextLine();
        System.out.println(passwordStrength(password));
    }

    public static String passwordStrength(String password) {
        boolean lengthError = password.length() < 8;
        boolean digitError = false;
        boolean uppercaseError = false;
        boolean lowercaseError = false;
        boolean specialError = false;
        String specialCharacters = " !\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~";
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (Character.isDigit(c)) {
                digitError = true;
            } else if (Character.isUpperCase(c)) {
                uppercaseError = true;
            } else if (Character.isLowerCase(c)) {
                lowercaseError = true;
            } else if (specialCharacters.indexOf(c) != -1) {
                specialError = true;
            }
        }
        boolean[] errors = {lengthError, !digitError, !uppercaseError, !lowercaseError, !specialError};
        int errorCount = 0;
        for (boolean error : errors) {
            if (error) {
                errorCount++;
            }
        }
        if (errorCount == 0) {
            return "Strong password";
        } else if (errorCount == 1) {
            return "Weak password";
        } else if (errorCount == 2) {
            return "Very weak password";
        } else {
            return "Extremely weak password";
        }
    }
}
