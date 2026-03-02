import java.util.Scanner;

public class L2_P2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
/*Write a program that takes the base and height in cm to find 
the area of a triangle in square inches and square centimeters */
        // Taking inputs in centimeters
        System.out.print("Enter base in cm: ");
        double base = sc.nextDouble();

        System.out.print("Enter height in cm: ");
        double height = sc.nextDouble();

        // Area in square centimeters
        double areaSqCm = 0.5 * base * height;

        // Convert sq cm to sq inches
        // 1 inch = 2.54 cm
        // 1 sq inch = (2.54 * 2.54) sq cm
        double areaSqIn = areaSqCm / (2.54 * 2.54);

        // Printing result
        System.out.printf("The Area of the triangle in sq in is %.2f and sq cm is %.2f",
                areaSqIn, areaSqCm);

        sc.close();
    }
}