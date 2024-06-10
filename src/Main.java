import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //A program that takes two numbers as inputs from the user and compares them.  It indicates if they are equal or if they are not indicates the one that is less. This program should be bullet-proofed. If either input is not a number, the program should indicate that the user should try again and terminate.
        double num1 = 0;
        double num2 = 0;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        if (in.hasNextDouble()) {
            num1 = in.nextDouble();
            in.nextLine();
        } else {
            System.out.print("You entered an invalid value.");
            System.out.println("Run the program again.");
            System.exit(0);
        }
        System.out.print("Enter the second number: ");
        if (in.hasNextDouble()) {
            num2 = in.nextDouble();
            in.nextLine();
        } else {
            System.out.print("You entered an invalid value.");
            System.out.println("Run the program again.");
            System.exit(0);
        }
        if (num1 == num2) {
            System.out.println("The numbers are equal.");
        } else if (num1 < num2) {
            System.out.println(num1 + " is less than " + num2 + ".");
        } else {
            System.out.println(num2 + " is less than " + num1 + ".");
        }

    }
}