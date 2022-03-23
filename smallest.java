import java.util.*;
public class smallest
{
public static void main (String []angs)
{
Scanner input=new Scanner(System.in);
System.out.print("input the first number");
double x=input.nextDouble();
System.out.print("input the second number");
double y=input.nextDouble();
System.out.print("input the third number");
double z=input.nextDouble();
System.out.print("the Smallest value is"+Smallest (x,y,z)+"\n");
}
public static double Smallest (double x,double y,double z)
{
return Math.min(Math.min(x,y),z);
}
}
