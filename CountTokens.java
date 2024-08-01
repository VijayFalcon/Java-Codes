import java.util.*;
public class CountTokens {
    public static void main(String[] args)
    {
        StringTokenizer st = new StringTokenizer("Heeere's Johnny!"," ");
        System.out.println("Total number of Tokens: "+st.countTokens());
    }
}
