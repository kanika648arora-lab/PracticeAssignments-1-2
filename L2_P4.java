import java.util.Scanner;

public class L2_P4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input in feet
        System.out.print("Enter distance in feet: ");
        double distanceInFeet = sc.nextDouble();

        // Convert feet to yards
        double distanceInYards = distanceInFeet / 3;

        // Convert feet to miles
        double distanceInMiles = distanceInFeet / 5280;

        // Printing result
        System.out.println("The distance in yards is " + distanceInYards +
                " while the distance in miles is " + distanceInMiles);

        sc.close();
    }
}