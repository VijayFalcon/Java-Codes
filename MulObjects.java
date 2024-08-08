public class MulObjects {
    int x = 18;
    public static void main(String[] args)
    {
        MulObjects o1 = new MulObjects();
        MulObjects o2 = new MulObjects();
        o2.x = 25;
        System.out.println(o1.x+" "+o2.x);
    }    
}
