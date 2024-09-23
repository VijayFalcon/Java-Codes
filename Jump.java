package Jump;

public class Jump {
	static void jump(int arr[])
	{
		int jumps = 0;
		int i = 0;
		while(i<=arr.length-1)
		{
			if(arr[i] == 0)
			{
				System.out.println(0);
				break;
			}
			else
			{
				i+=arr[i];
				jumps++;
			}
		}
		System.out.println(jumps);
	}
	public static void main(String[] args) {
		int arr[] = {1,4,3,2,6,7};
		jump(arr);
	}
}
