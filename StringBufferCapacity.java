public class StringBufferCapacity
{
    public static void main(String[] args)
    {
        StringBuffer sb = new StringBuffer();
        System.out.println("Default capacity: "+sb.capacity());
        sb.append("Hello");
        System.out.println("Capacity after appending: "+sb.capacity());
        sb.append("Java is my favourite language");
        System.out.println("Capacity after appending again: "+sb.capacity()); //(16*2)+2 = 34
        sb.ensureCapacity(10);//no change
        System.out.println("Capacity after ensuring capacity: "+sb.capacity());
        sb.ensureCapacity(50);//(34*2)+2 = 70
        System.out.println("Capacity after ensuring capacity again: "+sb.capacity());
    }
}
