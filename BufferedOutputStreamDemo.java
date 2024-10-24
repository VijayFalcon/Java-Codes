import java.io.*;
public class BufferedOutputStreamDemo
{
    public static void main(String[] args) throws IOException
    {
        FileOutputStream fo = new FileOutputStream("file2.txt");
        BufferedOutputStream bo = new BufferedOutputStream(fo);
        for(int i = 65;i<75;i++)
        {
            bo.write(i);
        }
        byte b[] = {75,76,77,78,79,80};
        bo.write(b);
        bo.flush();
        bo.close();
        fo.close();
    }
}
