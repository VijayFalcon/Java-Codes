package PositiveAndNegative;
import java.util.Scanner;

public class PositiveAndNegative {
	static void ArrSort(int[] arr)
	{
		int pArr[] = new int[arr.length];
		int pIndex = 0;
		int nArr[] = new int[arr.length];
		int nIndex = 0;
		for(int i = 0;i<arr.length;i++)
		{
			if(arr[i]>=0)
			{
				pArr[pIndex] = arr[i];
				pIndex++;
			}
			else 
			{
				nArr[nIndex] = arr[i];
				nIndex++;
			}
		}
		int ans[] = new int[arr.length];
		int ansIndex = 0;
		for(int i = 0;i<arr.length;i++)
		{
			if(i<pIndex)
			{
				ans[ansIndex] = pArr[i];
				ansIndex++;
			}
			if(i<nIndex)
			{
				ans[ansIndex] = nArr[i];
				ansIndex++;
			}
		}
		for(int i = 0;i<ans.length;i++)
		{
			System.out.printf("%d ",ans[i]);
		}
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int arr[] = {-5,-2,5,2,4,7,1,8,0,-8};
		ArrSort(arr);
		s.close();
	}
}
