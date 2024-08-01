import java.util.*;
public class HasMoreElem
{
    public static void main(String[] args)
    {
        StringTokenizer st = new StringTokenizer("Never in human history has so much been owed by so many by so few."," ");
        while(st.hasMoreElements())
        {
            System.out.printf("%s / ",st.nextToken());
        }
    }
}
