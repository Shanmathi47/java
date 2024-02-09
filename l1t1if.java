import java.util.Scanner;
public class l1t1if
{
  public static void main(String args[])
 {
 
 	Scanner scanner= new Scanner(System.in);	
	int a;
	do{
   System.out.println("\nC to F:Type 1\nF to C:Type 2\nC to K:Type 3\nK to C:Type 4\nK to F:Type 5 \nF to K:Type 6");
   a=scanner.nextInt();
  if (a==1)
  { 
   System.out.println("enter the temperature in Celsius:");
   double c=scanner.nextDouble();
   double x=((c*1.8f)+32);
   System.out.println("Fahrenheit:"+x);
 }
     else if (a==2)
 {
   System.out.println("enter the temperature in Fahrenheit:");
   double b=scanner.nextDouble();
   double d=((b-32)*0.55f);
   System.out.println("Celsius:"+d);
 }
    else if (a==3)
{
   System.out.println("enter the temperature in Celsius:");
   double e=scanner.nextDouble();
   double f=(e+273.15);
   System.out.println("Kelvin:"+f);
}
    else if (a==4)
{
   System.out.println("enter the temperature in Kelvin:");
   double g=scanner.nextDouble();
   double h=(g-273.15);
   System.out.println("Celsius:"+h);  
}
    else if (a==5)
{
   System.out.println("enter the temperature in Kelvin:");
   double i=scanner.nextDouble();
   double j=((i-273.15)*1.8+32);
   System.out.println("Fahrenheit:"+j);
}
    else if (a==6)
{
   System.out.println("enter the temperature in Fahrenheit:");
   double k=scanner.nextDouble();
   double l=((k-32)*1.55+273.15);
   System.out.println("Kelvin:"+l);   
}
   else
{
   System.out.println("incorrect choice");
}
}
  while(a!=0);
 }
}