import java.util.*;
public class fibanoci2
{
public static void main (String []args)
{
int max,prev=0,next=1;
System.out.print("How many numbers you want in fibanocci:");
Scanner input=new Scanner(System.in);
max=input.nextInt();
System.out.print("fibanocci Series of"+max+"numbers:");
for(int i=1;i<=max;i++)
{
System.out.print(prev+" ");
int sum=prev+next;
prev=next;
next=sum;
}
}
}