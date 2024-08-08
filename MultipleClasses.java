public class MultipleClasses {
    int x = 5;
    public static void main(String[] args)
    {
        MultipleClasses c1 = new MultipleClasses();
        MultipleClasses c2 = new MultipleClasses();
        System.out.println(c1.x);
        System.out.println(c2.x);
    }
}
