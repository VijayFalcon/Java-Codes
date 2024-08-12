package AbstractMain;
public class AbstractMain {
	public static void main(String[] args) {
		Student myObj = new Student();
		System.out.println("Name: "+myObj.fname);
		System.out.println("Graduation year: "+myObj.graduationYear);
		myObj.study();
	}
}
