package Star;
import java.util.Scanner;

public class Star 
{
	public static void main(String[] args)
	{
		int n;
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		scanner.close();
		int i,j;
		for(i=0;i<n;i++)
		{
			System.out.printf("* ");
		}
		System.out.printf("\n");
		for(i=1;i<(n-1);i++)
		{
			for(j=0;j<n;j++)
			{
				if((j==0)|(j==(n-1)))
				{
					System.out.printf("* ");
				}
				else
				{
					System.out.printf("  ");
				};
			}
			System.out.printf("\n");
		}
		for(i=0;i<n;i++)
		{
			System.out.printf("* ");
		}
	}
}
