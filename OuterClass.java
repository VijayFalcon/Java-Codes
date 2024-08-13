public class OuterClass {
    int x = 10;
    public class InnerClass{
        int x = 5;
        public int myInnerMethod()
        {
            return x;
        }
    }    
}
