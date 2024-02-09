import java.util.Scanner;
public class tempconv
{
public static void main(String args[])
{
Scanner scanner= new Scanner(System.in);
//c to f
	System.out.println("Enter the temperature in celcius:");
	float x=scanner.nextFloat();

	float z=(x*(1.8f)+32);
	System.out.println("Temperature in f ="+z);
// f to c
	System.out.println("Enter the temperature in farenheit:");
	float a=scanner.nextFloat();
	float b=((a-32)*(0.55f));
	System.out.println("Temperature in c ="+b);
	
    } 
}