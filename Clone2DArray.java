public class Clone2DArray {
    public static void main(String[] args) {
        int intArray[][] = {{1,2,3},{4,5}};
        int cloneArray[][] = intArray.clone(); //Shallow copy is created for 2D array (i.e) sub-arrays are shared.
        System.out.println(intArray == cloneArray); //Will print false.
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
            System.out.println("Real array: "+intArray[i][j]+" Cloned array: "+cloneArray[i][j]);}
        }
        //However, sub-arrays are shared.
        System.out.println(intArray[0] == cloneArray[0]);
        System.out.println(intArray[1] == cloneArray[1]);
}
}
