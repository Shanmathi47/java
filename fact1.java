
import java.util.Scanner;
public class fact1
{  
 public static void main(String args[])
{  
int sum=0;
int i=1;
int fact=1;  
 Scanner scanner = new Scanner(System.in);
 System.out.print("Enter a number: ");
 int n = scanner.nextInt();   
for(i=1;i<=n;i++)
{   
      fact=fact*i;    
   
 sum+=fact;
  System.out.println("sum "+sum);   
 } 
  } 
}  
