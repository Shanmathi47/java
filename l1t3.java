import java.util.Scanner;
public class l1t3
{
public static void main(String args[])
{
int s1,s2,s3,s4,s5;

int tot;
float avg;
Scanner scanner= new Scanner(System.in);
System.out.println("Enter the marks:");
 s1=scanner.nextInt();
 s2=scanner.nextInt();
 s3=scanner.nextInt();
 s4=scanner.nextInt();
 s5=scanner.nextInt();

tot=s1+s2+s3+s4+s5;

 if(tot>500 ) {
            System.out.println("Please enter a valid number of grades");
            return;
        }
avg=tot/5f;
System.out.println("Total:"+tot);
System.out.println("Average:"+avg);
}
}