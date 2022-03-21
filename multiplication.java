import java.util.*;
public class multiplication
{
public static void main (String args[])
{
Scanner input=new Scanner (System.in);
System.out.println("enter the number: ");
int num=input.nextInt();
for(int i=1;i<11;i++)
{
System.out.println(i+"*"+num+"="+(i*num));
}
}
}