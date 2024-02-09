

import java.util.Scanner;

public class arrays{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

 
        System.out.println("How many numbers do you want to enter?");
        int num = scanner.nextInt();

        int array[] = new int[num];

        System.out.println("Enter the " + num + " numbers now.");

        for (int i = 0 ; i < array.length; i++ ) {
           array[i] = scanner.nextInt();
        } 
        System.out.println("These are the numbers you have entered");
    

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

}

