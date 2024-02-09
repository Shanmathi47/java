import java.util.Scanner;
public class BubbleSort
{
 public static void main(String args[])
 {
  
 Scanner scanner=new Scanner(System.in);
 System.out.println("Enter the elements of the array:");
 int size=scanner.nextInt();
 int[] array=new int[size];
 
 
  for (int i = 0; i < size; i++) 
 {
   System.out.print("Element " + (i + 1) + ": ");        
   array[i] = scanner.nextInt();
  }
  int n = array.length;       
  for (int i = 0; i < n - 1; i++) 
  {
   for (int j = 0; j < n - 1 - i; j++)
    {
     if (array[j] > array[j + 1]) 
     {
       int temp = array[j];
       array[j] = array[j + 1];
       array[j + 1] = temp;  
     }
    }
   }
 System.out.println("sorted array:"); 
 for(int num:array)
{
System.out.println(num);
}         
}
}