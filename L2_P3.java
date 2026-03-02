import java.util.Scanner;

public class L2_P3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //Write a program to find the side of the square whose parameter you read from the user.

        // Taking perimeter as input
        System.out.print("Enter the perimeter of the square: ");
        double perimeter = sc.nextDouble();

        // Calculating side
        double side = perimeter / 4;

        // Printing result
        System.out.println("The length of the side is " + side +
            " whose perimeter is " + perimeter);

        sc.close();
    }
}