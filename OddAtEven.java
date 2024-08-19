package OddAtEven;
import java.util.Scanner;
public class OddAtEven {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for(int i = 1;i<n;i+=2)
		{
			System.out.printf("%d %d ",i,i-1);
		}
	}
}
