package WrapperExample2;
public class WrapperExample2 {
	public static void main(String[] args) {
		Integer a = new Integer(5);
		int i = a.intValue();
		int j = a;
		System.out.println(a+" "+i+" "+j);
	}
}