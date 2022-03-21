import java.util.*;
public class circle
{
public static void main (String args[])
{
Scanner input=new Scanner (System.in);
System.out.print("enter the radius of the circle");
 double rad=input.nextDouble();
System.out.println("area="+(Math.PI*rad*rad));
System.out.println("perimeter="+(2*Math.PI*rad));
}
}