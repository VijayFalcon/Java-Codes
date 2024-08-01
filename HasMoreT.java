import java.util.*;
public class NextTokens 
{
    public static void main(String[] args)
    {
        StringTokenizer st = new StringTokenizer("Never in human history has so much been owed by so many by so few."," ");
        while(st.hasMoreTokens())
        {
            System.out.printf("%s , ",st.nextToken());
        }
    }
}
