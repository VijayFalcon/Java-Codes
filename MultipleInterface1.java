package MultipleInterface1;

interface FirstInterface
{
	public void myMethod();
}
interface SecondInterface
{
	public void myOtherMethod();
}
interface ThirdInterface
{
	public int myNum();
}
class DemoClass implements FirstInterface,SecondInterface
{
	public void myMethod()
	{
		System.out.println("Some text...");
	}
	public void myOtherMethod()
	{
		System.out.println("Some other text...");
	}
	public int myNum()
	{
		return 25;
	}
}
public class MultipleInterface1
{
	public static void main(String[] args)
	{
		DemoClass myObj = new DemoClass();
		myObj.myMethod();
		myObj.myOtherMethod();
		System.out.print(myObj.myNum());
	}
}
