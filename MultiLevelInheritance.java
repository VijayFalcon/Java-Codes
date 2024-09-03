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
class Pup extends Dog
{
    void sleep()
    {
        System.out.println("Sleeping");
    }
}
public class MultilevelInheritance 
{
    public static void main(String args[])
    {
    Pup p = new Pup();
    p.eat();
    p.sleep();
    p.bark();
    }    
}
