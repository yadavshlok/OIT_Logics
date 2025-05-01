/*A milk vendor buys milk at the rate of 3.25/- the then adds a litre of water for every four litres of
milk and sells the water milk at the rate of 4.15/1t. calculate the gain for milk vendor?*/

import java.util.*;

public class Q37
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Milk(in Ltr)");
        int m=sc.nextInt();
        int w=m/4;

        Double mc=m*3.25;

        int pm=m+w;

        Double sp=pm*4.15;

        Double p= sp-mc;

        System.out.println("Purchase6 cost is " +mc+" RS");
        System.out.println("Selling cost is " +sp+" RS");
        System.out.println("Total Profit is " +p+" RS");
    }
}