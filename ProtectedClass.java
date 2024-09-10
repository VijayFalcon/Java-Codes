class A
{
    protected void msg(){System.out.println("Hello");}
}
public class ProtectedClass extends A
{
    public static void main(String args[])
    {
        ProtectedClass pc = new ProtectedClass();
        pc.msg();
    }
}
