package SuperMethod;
class Animal
{
	void eat() {System.out.println("Eating...");}
}
class Dog extends Animal
{
	void eat() {System.out.println("Eating bread...");}
	void bark() {System.out.println("Barking...");}
	void work() {super.eat();}
}
public class SuperMethod {
	public static void main(String[] args)
	{
		Dog d = new Dog();
		d.eat();
		d.bark();
		d.work();
	}
}
