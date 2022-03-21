import java.util.*;
public class sum
{
public static void main (String args[])
{
int sum=0;
int temp;
Scanner input=new Scanner (System.in);
System.out.println("enter the digit: ");
int num=input.nextInt();
while(num>0)
{
temp=num%10;
sum=sum+temp;
num=num/10;
}
System.out.println("sum of digit="+sum);
}
}
