import java.util.Scanner;
public class Arrays {
    public static void main(String[] args)
    {
        int[] arr; //Declares array.
        arr = new int[5]; //Allocates memory.
        arr[0] = 10; //Assigns value to first element.
        arr[1] = 20; //Assigns value to second element.
        arr[2] = 30; //Assigns value to third element.
        arr[3] = 40; //Assigns value to fourth element.
        arr[4] = 50; //Assigns value to fifth element.
        System.out.println("Elements of array are: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element at index " + i + " is " + arr[i]);
        }
    }
}
