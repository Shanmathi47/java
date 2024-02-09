
import java.util.Scanner;  
public class ebill2
{  
    public static void main(String args[])   
    {     
 
        double unit;  
  	double amount = 0;  

	double tariff1=1.2;
	double tariff2=2;
	double tariff3=3;

	double tariff4=5.2;
	double tariff5=7;
	double tariff6=8;
        Scanner scanner = new Scanner(System.in);  
  	
 	System.out.println("Enter consumer name:");  
        String name= scanner.nextLine();

 	System.out.println("Enter consumer no:");  
        int no= scanner.nextInt();
	
	System.out.println("Type 1 : Commercial \nType 2 : Domestic");
	int a=scanner.nextInt();
        System.out.println("Enter previous month reading in (kwt)");  
        double previous= scanner.nextInt();  
        System.out.println("Enter current month reading in (kwt)");  
        double current= scanner.nextInt();  
  	unit=current-previous;
	if(a==2){
        if(unit <=100)  
        {  
            amount = unit * tariff1;  
        }  
  
        else if(unit >100 && unit<=300){  
            amount = 100 * tariff1 + (unit - 100) * tariff2;  
        }  
      
        else if(unit >300)  
        {  
            amount= 100 *tariff1 + 200 * tariff2 + (unit - 300) * tariff3;  
        }  
        System.out.println("The electricity bill for " +unit+ " is : " + amount);  
	}
	else if(a==1){
 	if(unit <=100)  
        {  
            amount = unit * 5.2;  
        }  
  
        else if(unit >100 && unit<=300){  
            amount = 100 * tariff4 + (unit - 100) * tariff5;  
        }  
      
        else if(unit >300)  
        {  
            amount= 100 *tariff4 + 200 * tariff5 + (unit - 300) * tariff6;  
        }  
        System.out.println("The electricity bill for " +unit+ " is : " + amount);  
	}
    }   
}
