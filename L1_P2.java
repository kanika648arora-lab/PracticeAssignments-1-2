import java.io.*;
import java.util.*;
class L1_P2
{
    public static void main (String args[])
    {
        /*Sam’s mark in Maths is 94, Physics is 95 and Chemistry is 96 out of 100. Find the average percent mark in PCM
         I/P => NONE
        O/P => Sam’s average mark in PCM is ___*/
      int m=94;
      int p=95;
      int c=96;
      double avg = (m+p+c)/3.0;
      System.out.println ("Sam’s average mark in PCM is " + avg);
    }
}