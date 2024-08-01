//Creating an array of objects.
class Student
{
    public int roll_no;
    public String name;
    Student(int roll_no,String name)
    {
        this.roll_no = roll_no;// It is like this pointer in C++.
        this.name = name;
    }
}

public class ArrayOfObjects
{
    public static void main(String[] args)
    {
        Student[] arr;
        arr = new Student[5];
        arr[0] = new Student(1,"Rahul");
        arr[1] = new Student(2,"Madhav");
        arr[2] = new Student(3,"Rohan");
        arr[3] = new Student(4,"Surya");
        arr[4] = new Student(5,"Veer");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i].roll_no+" "+arr[i].name);
        }
    }
}
