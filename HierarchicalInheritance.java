class Animal
{
    void eat()
    {
        System.out.println("Eating");
    }
}
class Dog extends Animal
{
    void bark()
    {
        System.out.println("Barking");
    }
}
class Cat extends Animal
{
    void claw()
    {
        System.out.println("Clawing");
    }
} 
public class HierarchicalInheritance 
{
    public static void main(String args[])
    {
    Cat c = new Cat();
    Dog d = new Dog();
    c.eat();
    c.claw();
    d.bark();
    }    
}
