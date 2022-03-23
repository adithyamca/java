import java.util.*;
public class vowels
{
public static void main (String []args)
{
Scanner input=new Scanner(System.in);
String Str=input.nextLine();
System.out.print("number of vowels in the String:"+ CountVowels(Str) +"\n");
}
public static int CountVowels(String Str)
{
int Count=0;
for(int i=0;i<Str.length();i++)
{
if(Str.charAt(i)=='a'||Str.charAt(i)=='e'||Str.charAt(i)=='i'||Str.charAt(i)=='o'||Str.charAt(i)=='u')
{
Count++;
}
}
return Count;
}
}
