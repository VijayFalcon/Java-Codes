public class FinalAttribute {
    final int x = 16;
    public static void main(String[] args)
    {
        FinalAttribute a = new FinalAttribute();
        System.out.printf("I know I told you that the F-%d is the coolest.",a.x);
        a.x-=2; //Error.
        System.out.printf("\nBut the F-%d is even cooler.",a.x);
    }    
}
