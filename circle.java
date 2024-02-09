public class circle
{
public static void main(String args[])
{
float r=5f;
float pi=3.14f;
double circum;
double area;
//area=pi*r*r;
area=Math.PI*Math.pow(r,2);
circum=2*Math.PI*r;
System.out.println("Area:"+area);
System.out.println("Circumference"+circum);
}
}
