import java.util.Scanner;
public class largest
{
 public static void main(String args[])
 { 
 Scanner scanner=new Scanner(System.in); 
 System.out.println("Enter the elements of the array:");
 int size=scanner.nextInt();
 int[] arr=new int[size];
  for (int i = 0; i < size; i++) 
 {
   System.out.print("Element " + (i + 1) + ": ");        
   arr[i] = scanner.nextInt();
  }
	int i=0;
		int max = arr[0]; 	
		for (i = 1; i < arr.length; i++) {
			if (arr[i] > max) 
				max = arr[i]; }

		System.out.println("Largest in given array is " + max); 
		} 
} 
