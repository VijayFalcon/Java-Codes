package FoodProblem;
import java.util.Scanner;
public class FoodProblem {
	static void cost(int x,int y)
	{
		System.out.println(x*y);	
	}
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int t = s.nextInt();
		for(int i = 0;i<t;i++)
		{
			cost(s.nextInt(),s.nextInt());
		}
		s.close();
	}
}
