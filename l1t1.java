import java.util.Scanner;
public class l1t1
{
  public static void main(String args[])
 {
   Scanner scanner= new Scanner(System.in);
   System.out.println("Celsius to F:Type 1 and F to C:Type 2");
   System.out.println("Celsiu to K:Type 3 and K to C:Type 4");
   System.out.println("K to F:Type 5 and F to K:Type 6");
   int x=scanner.nextInt();
        
   switch(x)
  { 
  case 1:
   System.out.println("enter the temperature in Celsius:");
   double c=scanner.nextDouble();
   double a=((c*1.8f)+32);
   System.out.println("Fahrenheit:"+a);
   break;
   
  case 2:
   System.out.println("enter the temperature in Fahrenheit:");
   double b=scanner.nextDouble();
   double d=((b-32)*0.55f);
   System.out.println("Celsius:"+d);
   break;
   
   case 3:
   System.out.println("enter the temperature in Celsius:");
   double e=scanner.nextDouble();
   double f=(e+273.15);
   System.out.println("Kelvin:"+f);
   break;
   
  case 4:
   System.out.println("enter the temperature in Kelvin:");
   double g=scanner.nextDouble();
   double h=(g-273.15);
   System.out.println("Celsius:"+h);  
   break;
   
   case 5:
   System.out.println("enter the temperature in Kelvin:");
   double i=scanner.nextDouble();
   double j=((i-273.15)*1.8+32);
   System.out.println("Fahrenheit:"+j);
   break;
   
   case 6:
   System.out.println("enter the temperature in Fahrenheit:");
   double k=scanner.nextDouble();
   double l=((k-32)*1.55+273.15);
   System.out.println("Kelvin:"+l);   
   break;
  
  default:
  System.out.println("incorrect choice");
  break;
  }
 }
}