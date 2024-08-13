public class MainClass {
    public static void main(String[] args) {
        OuterClass myOuter = new OuterClass();
        OuterClass.InnerClass myInner = myOuter.new InnerClass();
        System.out.println(myInner.x + myOuter.x);
        System.out.println(myInner.myInnerMethod() + myOuter.x);
    }    
}
