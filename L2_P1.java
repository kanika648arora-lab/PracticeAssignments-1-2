import java.util.Scanner;

public class L2_P1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        /*Write a program to create a basic calculator for addition, subtraction, multiplication, and division. 
        The program should ask for two numbers (floating point) and perform all the operations. */
        // Taking user inputs
        System.out.print("Enter first number: ");
        double number1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double number2 = sc.nextDouble();

        // Performing arithmetic operations
        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = number1 / number2;

        // Printing result
        System.out.println("The addition, subtraction, multiplication, and division value of 2 numbers "
            + number1 + " and " + number2 + " is "
            + addition + ", " + subtraction + ", "
            + multiplication + ", and " + division);

        sc.close();
    }
}