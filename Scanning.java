package Scanning;
import java.util.Scanner;
public class Scanning {
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("What is your name? Enter: ");
		String name = scanner.nextLine();
		System.out.println("What's your age? ");
		int age = scanner.nextInt();
		scanner.nextLine();
		System.out.println("What's your favourite food? ");
		String food = scanner.nextLine();
		System.out.println("Hello "+name+"\nYou are "+age+" years old!\nYou like "+food+"!");
	}
}
