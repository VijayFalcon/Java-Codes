public class Exception2 {
    public static void main(String[] args)
    {
        try{
            int data=100/0;
        }
        catch(ArithmeticException e)
        {
            System.out.println("Can't be divided by zero.");
        }
    }   
}
