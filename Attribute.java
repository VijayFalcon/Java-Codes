public class Attribute {
    int x = 16;
    public static void main(String[] args)
    {
        Attribute a = new Attribute();
        System.out.printf("I know I told you that the F-%d is the coolest.",a.x);
        a.x-=2;
        System.out.printf("\nBut the F-%d is even cooler.",a.x);
    }    
}
