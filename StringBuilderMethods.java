//String builder is more efficient than string buffer, but it is no synchronized.
//Meaning, it cannot be used in a multi-threaded environment(multiple files 
//being executed at the same time).
public class StringBuilderMethods
{
    public static void main(String[] args)
    {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" Java");
        System.out.println("Hello + Java (appending) = "+sb);
        System.out.println("Length of the string buffer: "+ sb.length());
        System.out.println("Reverse of the string buffer: "+sb.reverse());
        sb.reverse();
        sb.replace(0,1,"J");
        System.out.println("After replacing the first character: "+sb);
        sb.insert(5," rhymes with");
        System.out.println("After inserting a word between the string buffer: "+sb);
        sb.delete(0,17);
        System.out.println("After deleting everything in the string buffer except Java: "+sb);
        //It works the same way as StringBuffer in every way. Except for the data handling.
    }
}
