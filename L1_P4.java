import java.io.*;
import java.util.*;
class L1_P4
{
    public static void main (String args[])
    {
        /* Create a program to calculate the profit and loss in number and percentage 
        based on the cost price of INR 129 and the selling price of INR 191. 
        Hint => 
        Use a single print statement to display multiline text and variables.
        Profit = selling price - cost price
        Profit Percentage = profit / cost price * 100
        I/P => NONE
        O/P => 
        The Cost Price is INR ___ and Selling Price is INR ___
        The Profit is INR ___ and the Profit Percentage is ___*/
        double costPrice = 129;
        double sellingPrice = 191;
        double profit = sellingPrice - costPrice;
        double profitPercentage = (profit / costPrice) * 100;
        // Single print statement with multiline output
        System.out.printf( "The Cost Price is INR %.0f and Selling Price is INR %.0f%n" +
            "The Profit is INR %.0f and the Profit Percentage is %.2f%%",
            costPrice, sellingPrice, profit, profitPercentage);
    }
}