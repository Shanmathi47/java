import java.util.Scanner;

public class pal
{
    public static void main(String args[]) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a phrase: ");
        String phrase = scanner.nextLine();
        phrase = phrase.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversedPhrase = new StringBuilder(phrase).reverse().toString();
        if (phrase.equals(reversedPhrase))
	{
            System.out.println("" + phrase + " is a palindrome.");
        } 
	else 
	{
            System.out.println("" + phrase + " is not a palindrome.");
        }
    }
}
