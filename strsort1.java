import java.util.Scanner;

public class strsort1 {
  public static void main (String [] args) 
{
    Scanner scanner=new Scanner(System.in);
 	int size;
	size=5;
 	String[] array=new String[size];
 
  for (int i = 0; i < size; i++) 
 {
   System.out.print("Element" + (i + 1) + ": ");        
   array[i] = scanner.next();
 }

System.out.print("array is:"); 
 for(String n:array)
{
System.out.println(n);
}         
}
}