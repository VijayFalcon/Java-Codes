package ZeroArray;
import java.util.Scanner;
public class ZeroArray {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[] = new int[n];
		for(int i = 0;i<n;i++)
		{
			arr[i] = s.nextInt();
		}
		for(int i = 0;i<n;i++)
		{
			for(int j = 0;j<n-1;j++)
			{
				if(arr[j] == 0 && arr[j+1]!=0)
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		for(int i = 0;i<n;i++)
		{
			System.out.printf("%d ",arr[i]);
		}
		s.close();
	}
}
