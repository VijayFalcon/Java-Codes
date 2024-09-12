class Helper
{
    static int Multiply(int a,int b)
    {
        return a*b;
    }
    static double Multiply(double a,double b)
    {
        return a*b;
    }
}


public class Polymorphism {
    public static void main(String args[])
    {
        Helper h = new Helper();
        System.out.println(h.Multiply(2,4));
        System.out.println(h.Multiply(2.5,4.5));
    }
}
