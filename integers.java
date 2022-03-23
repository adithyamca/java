import java.util.*;
public class integers
{
public static void main (String args[])
{
Scanner input=new Scanner (System.in);
System.out.print("enter the number: ");
int x=input.nextInt();
System.out.print("enter the number: ");
int y=input.nextInt();
System.out.print("enter the number: ");
int z=input.nextInt();
System.out.println("the result is: "+Sum (x,y,z));
}
public static boolean Sum (int p,int q,int r)
{
return((p+q)==r||(q+r)==p||(r+p)==q);
}
}