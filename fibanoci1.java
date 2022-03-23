import java.util.*;
public class fibanoci1
{
public static void main (String []args)
{
int max=10,prev=0,next=1,i=1;
System.out.print("Fibanocci Series of "+max+"numbers:");
while(i<=max)
{
System.out.print(prev+" ");
int sum=prev+next;
prev=next;
next=sum;
i++;
}
}
}