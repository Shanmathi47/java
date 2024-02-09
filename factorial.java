import java.util.Scanner;
class factorial{  
 public static void main(String args[])
{  
  int i,fact=1;  
 Scanner scanner = new Scanner(System.in);
 System.out.print("Enter a number: ");
 int n = scanner.nextInt();   
  for(i=1;i<=n;i++){    
      fact=fact*i;    
  }    
  System.out.println("Factorial of "+n+" is: "+fact);    
 }  
}  