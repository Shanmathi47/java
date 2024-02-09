
import java.util.Scanner;  
 
public class ebill 
{  
    public static void main(String args[])   
    {     
 
        double unit;  
  	double tariff = 0;    
        Scanner scanner = new Scanner(System.in);  
  	
 	System.out.println("Enter consumer name:");  
        String name= scanner.nextLine();

 	System.out.println("Enter consumer no:");  
        int no= scanner.nextInt();

        System.out.println("Enter previous month reading in (kwt)");  
        double previous= scanner.nextInt();  
        System.out.println("Enter current month reading in (kwt)");  
        double current= scanner.nextInt();  
  	unit=current-previous;
        if(unit <=100)  
        {  
            tariff = unit * 1.20;  
        }  
  
        else if(unit >100 && unit<=300){  
            tariff = 100 * 1.20 + (unit - 100) * 2;  
        }  
      
        else if(unit >300)  
        {  
            tariff= 100 * 1.20 + 100 * 2 + (unit - 300) * 3;  
        }  
        System.out.println("The electricity bill for " +unit+ " is : " + tariff);   
    }   
}
