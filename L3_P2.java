import java.util.Scanner;

public class L3_P2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking Fahrenheit input
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = sc.nextDouble();

        // Converting to Celsius
        double celsiusResult = (fahrenheit - 32) * 5 / 9;

        // Printing result
        System.out.println("The " + fahrenheit +
                " fahrenheit is " + celsiusResult + " celsius");

        sc.close();
    }
}