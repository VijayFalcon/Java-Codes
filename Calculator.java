package calculator;

import java.util.Scanner;
public class Calculator
{
    public static void main(String[] args)
    {
        int i;
        float a,b;
        String opr;
        boolean flag = true;
        Scanner s = new Scanner(System.in);
        System.out.println("Welcome to my calculator. Type the following prompts to access their respective operations: ");
        System.out.println("\na for Addition.\ns for Subtraction.\nm for Multiplication.\nd for Division.\nr for Remainder/"
        		+ "Modulus.\ne for Exponential.\n");
        while(flag==true)
        {
        	System.out.println("Input operation: ");
            opr = s.nextLine();
            switch(opr)
            {
                case "a":
                {
                    System.out.println("You have chosen addition!");
                    System.out.println("Enter the first operand: ");
                    a = s.nextFloat();
                    System.out.println("Enter the second operand: ");
                    b = s.nextFloat();
                    s.nextLine();
                    System.out.println(a+" + "+b+" = "+(a+b));
                    break;
                }
                case "s":
                {
                    System.out.println("You have chosen subtraction!");
                    System.out.println("Enter the first operand: ");
                    a = s.nextFloat();
                    System.out.println("Enter the second operand: ");
                    b = s.nextFloat();
                    s.nextLine();
                    System.out.println(a+" - "+b+" = "+(a-b));
                    break;
                }
                case "m":
                {
                    System.out.println("You have chosen multiplication!");
                    System.out.println("Enter the first operand: ");
                    a = s.nextFloat();
                    System.out.println("Enter the second operand: ");
                    b = s.nextFloat();
                    s.nextLine();
                    System.out.println(a+" x "+b+" = "+(a*b));
                    break;
                }
                case "d":
                {
                    System.out.println("You have chosen division!");
                    System.out.println("Enter the first operand: ");
                    a = s.nextFloat();
                    System.out.println("Enter the second operand: ");
                    b = s.nextFloat();
                    s.nextLine();
                    System.out.println(a+" / "+b+" = "+(a/b));
                    break;
                }
                case "r":
                {
                    System.out.println("You have chosen modulus!");
                    System.out.println("Enter the first operand: ");
                    a = s.nextFloat();
                    System.out.println("Enter the second operand: ");
                    b = s.nextFloat();
                    s.nextLine();
                    System.out.println(a+" % "+b+" = "+(a%b));
                    break;
                }
                case "e":
                {
                    System.out.println("You have chosen exponential!");
                    System.out.println("Enter the first operand: ");
                    a = s.nextFloat();
                    System.out.println("Enter the second operand: ");
                    b = s.nextFloat();
                    s.nextLine();
                    System.out.println(a+" ^ "+b+" = "+Math.pow(a,b));
                    break;
                }
                default:
                {
                    System.out.println("Invalid input!");
                    break;
                }
            }
            System.out.println("Continue?(true/false): ");
            flag = s.nextBoolean();
            s.nextLine();
    }
        System.out.println("Thank you for using my calculator.");
        s.close();
    }
}
