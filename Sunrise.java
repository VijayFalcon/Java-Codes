package Sunrise;
public class Sunrise {
	static void See(int arr[])
	{
		int count = 0;
		for(int i= 0;i<arr.length;i++)
		{
			int check = i-1;
			int see = 0;
			if(i == 0)
			{
				count++;
			}
			while(check>=0)
			{
				if(arr[i]<=arr[check])
				{
					see = 0;
					break;
				}
				else
				{
					see = 1;
					check--;
				}
			}
			if(see == 1)
			{
				count++;
			}
		}
		System.out.println(count);
	}
	public static void main(String[] args) {
		int arr[] = {2,3,4,5};
		See(arr);
	}
}
