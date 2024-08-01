import java.util.StringTokenizer;
public class NextElements
{
    public static void main(String[] args)
    {
        StringTokenizer st = new StringTokenizer("My name is Vijay"," ");
        while(st.hasMoreElements())
        {
            System.out.println(st.nextElement());
        }
    }
} 
