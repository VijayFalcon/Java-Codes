import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
public class BufferedInputStreamDemo {
    public static void main(String args[]) throws IOException{
        FileInputStream fi = new FileInputStream("file1.txt");
        BufferedInputStream bi = new BufferedInputStream(fi);
        System.out.println("Number of remaining bytes: "+bi.available());
        boolean b = bi.markSupported();
        if(b)  bi.mark(bi.available());
        bi.skip(4);
        System.out.print("Jacksepticeye: ");
        int i;
        while((i=bi.read())!=-1)
        {
            System.out.print((char)i);
        }
        System.out.println();
        bi.reset();
        while((i=bi.read())!=-1)
        {
            System.out.print((char)i);
        }
        fi.close();
    }
}
