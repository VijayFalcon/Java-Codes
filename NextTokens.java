import java.util.*;
public class NextTokens {
    public static void main(String[] args)
    {
        StringTokenizer st = new StringTokenizer("My,name,is,Vijay");
        System.out.println("Next token is: "+st.nextToken(",")); //Prints only "My".
    }
}
