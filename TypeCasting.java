//18/7/24.
//Type casting.

public class TypeCasting
{
public static void main(String args[])
{
//Automatic type casting.
int i = 9;
double d = i;
System.out.println("The integer value is: "+i+"\nThe double value is: "+d);

//Narrow type casting (explicit).
d = 9.87d;
i = (int) d;
System.out.println("The double value is: "+d+"\nThe integer value is: "+i);

//Wide type casting (explicit).
float f = 3.14f;
d = (double) f;
System.out.println("The float value is: "+f+"\nThe double value is: "+d);
}
}



