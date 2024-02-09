import java.util.Scanner;

public class palin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String a = scanner.nextLine();

        if (isPalindrome(a)) {
            System.out.println(a + " is a palindrome.");
        } else {
            System.out.println(a + " is not a palindrome.");
        }
    }

    private static boolean isPalindrome(String str) {
        str = str.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) 
	    {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}