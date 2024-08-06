public class CloneArray {
    public static void main(String[] args) {
        int intArray[] = {1,2,3};
        int cloneArray[] = intArray.clone(); //Deep copy is created for 1D array.
        System.out.println(intArray == cloneArray); //Will print false, since it's a deep copy.
        for(int i=0;i<3;i++)
        {
            System.out.println("Real array: "+intArray[i]+" Cloned array: "+cloneArray[i]);
        }
}
}
