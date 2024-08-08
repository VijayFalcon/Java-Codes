public class Cars {
    public void fullThrottle()
    {
        System.out.println("The car is going as fast as it can!");
    }
    public void maxSpeed(int m)
    {
        System.out.printf("This car can be gunned as far as %d mph\n",m);
    }
    public static void main(String[] args) {
        Cars c = new Cars();
        c.maxSpeed(240);
        c.fullThrottle();
    }
}
