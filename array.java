import java.util.*;
public class array
{
public static void main (String []angs)
{
int[] my_array1 = {101,234,111,555,107,234,869,367};
String[] my_array2={"java","python","PHP","C#","C++"};
System.out.println("original string numeric array:"+Arrays.toString (my_array1));
Arrays.sort (my_array1);
System.out.println("Sorted numeric array:"+Arrays.toString (my_array1));
System.out.println("original string numeric array:"+Arrays.toString (my_array2));
Arrays.sort (my_array2);
System.out.println("Sorted numeric array:"+Arrays.toString (my_array2));
}
}