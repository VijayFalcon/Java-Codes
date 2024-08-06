public class SumArray {

    public static void sum(int[] arr)
    {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];}
        System.out.println("Sum of array values: "+sum);
    }
    public static void main(String[] args) {
        int arr[] = {80,88,84,82,86};
        sum(arr);
    }
}
