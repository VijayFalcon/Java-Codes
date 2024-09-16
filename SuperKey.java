package SuperKey;
class Animal
{
	String color = "white";
}
class Dog extends Animal
{
	String color = "black";
	void PrintColor()
	{
		System.out.println(color);
	}
	void PrintAnimalColor()
	{
		System.out.println(super.color);
	}
}
public class SuperKey {
	public static void main(String[] args) {
		Dog a = new Dog();
		a.PrintColor();
		a.PrintAnimalColor();
	}

}
