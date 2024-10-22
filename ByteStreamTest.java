import java.io.*;
public class ByteStreamTest {
    public static void main(String args[]) throws IOException
    {
        ByteArrayOutputStream bOutput = new ByteArrayOutputStream(12);
        while(bOutput.size()!=10)
        {
            bOutput.write("Hello".getBytes());
        }
        byte b[] = bOutput.toByteArray();
        System.out.println("Printing the content: ");
        for(int x=0;x<b.length;x++)
        {
            System.out.print((char)b[x]+" ");
        }
        System.out.println(" ");
        int c;
        ByteArrayInputStream bInput = new ByteArrayInputStream(b);
        System.out.println("Converting characters to upper case: ");
        for(int y = 0;y<1;y++)
        {
            while((c=bInput.read())!=-1)
            {
                System.out.println(Character.toUpperCase((char)c));
            }
            bInput.reset();
        }
    }
}
