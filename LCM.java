package LCM;
import java.util.Scanner;

public class LCM {
	public static void main(String[] args)
	{
		int x,y;
		Scanner scanner = new Scanner(System.in);
		int i;
		System.out.println("Enter the first number: ");
		x = scanner.nextInt();
		System.out.println("Enter the second number: ");
		y = scanner.nextInt();
		boolean flag = false;
		int smallest = Math.max(x, y);
		for(i=2;i<=smallest;i++)
		{
			if((x%i == 0) & (y%i == 0))
			{
				System.out.println("LCM = "+i);
				flag = true;
				break;
			}
		}
		if (flag == false)
		{
		System.out.println("LCM = "+1);;
		}
	}
}
