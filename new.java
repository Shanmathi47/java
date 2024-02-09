import java.util.Scanner;
public class new
 { 
    public static void main(String args[]) 
    { 
	Scanner scanner= new Scanner(System.in);
	System.out.println("Enter number 1:");
	int x=scanner.nextInt();
	
	System.out.println("Enter number 2:");
	int y=scanner.nextInt();
	
	int z=x+y;
	System.out.println("Sum="+z);
	
    } 
}