class Parent
{
    void display()
    {
        System.out.println("Parent");
    }
}
class Child1 extends Parent{
    void display()
    {
        System.out.println("Child1");
    }
}
class Child2 extends Parent{
    void display()
    {
        System.out.println("Child2");
    }
}
public class MethodOverRide {
    public static void main(String args[])
    {
    Parent a;
    a = new Parent();
    a.display();
    a = new Child1();
    a.display();
    a = new Child2();
    a.display();
    }
}
