/*The temperature of the city is input through the keyboard in Fahrenheit. Write a program to
convert into Celsius?*/

import java.util.*;

public class Q38
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temp in Fahrenheit :");

        Double f = sc.nextDouble();

        Double c = (f-32)/1.8;

        System.out.println(f+" f is "+c+" c");
    }
}