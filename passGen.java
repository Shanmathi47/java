import java.util.Scanner;
import java.util.Random;

public class passGen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the desired length of the password: ");
        int length = input.nextInt();
        input.nextLine();
        System.out.print("Include numbers? (y/n): ");
        boolean includeNumbers = input.nextLine().equalsIgnoreCase("y");
        System.out.print("Include lowercase letters? (y/n): ");
        boolean includeLowercase = input.nextLine().equalsIgnoreCase("y");
        System.out.print("Include uppercase letters? (y/n): ");
        boolean includeUppercase = input.nextLine().equalsIgnoreCase("y");
        System.out.print("Include special characters? (y/n): ");
        boolean includeSpecial = input.nextLine().equalsIgnoreCase("y");

        String numbers = "0123456789";
        String lowercase = "abcdefghijklmnopqrstuvwxyz";
        String uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String special = "!@#$%^&*()_+-=[]{}|;:,.<>?";

        String characters = "";
        if (includeNumbers) {
            characters += numbers;
        }
        if (includeLowercase) {
            characters += lowercase;
        }
        if (includeUppercase) {
            characters += uppercase;
        }
        if (includeSpecial) {
            characters += special;
        }

        Random random = new Random();
        StringBuilder password = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            password.append(characters.charAt(index));
        }

        System.out.println("Your password is: " + password.toString());
    }
}
