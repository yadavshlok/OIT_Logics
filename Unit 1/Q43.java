//write a program to find kinetic energy and potential energy

import java.util.*;

public class Q43
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter mass :");
        double ms = sc.nextDouble();

        System.out.println("Enter velocity :");
        double vel = sc.nextDouble();

        System.out.println("Enter height :");
        double ht = sc.nextDouble();

        double g = 9.8;

        double kineticEnergy = 0.5*ms*Math.pow(vel, 2);

        double potentialEnergy = ms*g*ht;

        System.out.println("Kinetic Energy : " + kineticEnergy + " J");
        System.out.println("Potential Energy : " + potentialEnergy + " J");
    }
}