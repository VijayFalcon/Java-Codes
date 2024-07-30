import java.util.Scanner;

public class ThirdLargest{
    public static void main(String[] args)
    {
         Scanner s = new Scanner(System.in);
         int i,temp,n,j;
         System.out.println("Enter the size of the array: ");
         n = s.nextInt();
         int arr[];
         arr = new int[n];
         System.out.println("Enter the "+n+" elements of the array: ");
         for(i=0;i<n;i++)
         {
            arr[i] = s.nextInt();
         }
         for(i=0;i<n;i++)
         {
            for(j=0;j<(n-1);j++)
            {
                if(arr[j]>arr[j+1])
                {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
         }
         System.out.println("The third largest element is: "+ arr[n-3]);
    }    
}
