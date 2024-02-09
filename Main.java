import java.util.Scanner;

class Main {

     static int fact(int a) {
        int f = 1,tot=0;
        for (int i = 1; i <= a; i++) {      
  	f=f*i;
	tot+=f;
	}      return tot;
    }

    public static void main(String args[]) {
        int a, tot;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        a = sc.nextInt();
        System.out.println("Factorial is:"+fact(a));
    } 
}