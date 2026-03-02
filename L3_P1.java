import java.util.Scanner;

public class L3_P1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        /*Write a TemperaturConversion program, given the temperature in Celsius 
        as input outputs the temperature in Fahrenheit*/

        // Taking Celsius input
        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();

        // Converting to Fahrenheit
        double fahrenheitResult = (celsius * 9 / 5) + 32;

        // Printing result
        System.out.println("The " + celsius + 
            " celsius is " + fahrenheitResult + " fahrenheit");

        sc.close();
    }
}