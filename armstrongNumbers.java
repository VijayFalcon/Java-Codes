package armstrongNumbers;
import java.util.Scanner;

public class armstrongNumbers 
{
	public static void main(String args[])
	{
		 int n,i;
		 int x,y;
		 String num;
		 System.out.println("Enter the first integer: ");
		 Scanner scanner = new Scanner(System.in);
		 x = scanner.nextInt();
		 System.out.println("Enter the second integer: ");
		 y = scanner.nextInt();
		 scanner.close();
		 for(i=x;i<=y;i++)
		 {
		 num= Integer.toString(i);
		 char numarr[] = num.toCharArray();
		 n = num.length();
		 int sum = 0;
		 for (int j:numarr) 
		 {
		 int digit = Integer.parseInt(Character.toString(j));
		 sum += Math.pow(digit, n);
		 }
		 if (sum == i)
		 {
			 System.out.println(i);
		 }
		 }
	}
}
