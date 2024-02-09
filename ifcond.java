import java.util.Scanner;
public class ifcond
 { 
    public static void main(String args[]) 
    { 
	Scanner scanner= new Scanner(System.in);

	System.out.println("Enter a:");
	int a=scanner.nextInt();
	System.out.println("Enter b:");
	int b=scanner.nextInt();
	if(a>b)
	{
	System.out.println("a is greater");
	}
	else
	{
	System.out.println("b is greater");
	}
}
}