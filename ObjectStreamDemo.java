import java.io.ObjectStreamClass;
import java.util.ArrayList;
public class ObjectStreamDemo {
    public static void main(String[] args)
    {
        ObjectStreamClass stream = ObjectStreamClass.lookup(Number.class);
        ObjectStreamClass stream1 = ObjectStreamClass.lookupAny(ArrayList.class);
        System.out.println(stream.forClass());
        System.out.println(stream1.forClass());
    }
}
