import java.util.Scanner;
public class whileloop
{
public static void main(String args[])
{
	Scanner scanner= new Scanner(System.in);

	System.out.println("Enter i:");
	int i=scanner.nextInt();
do{
	System.out.println(+i);
	i++;
  }
while(i<=10);
}
}