//Calculate sum & average of array elements.

import java.util.Scanner;

public class Q01
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter "+n+" elements : ");
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        for(int i = 0; i < n; i++)
        {
            sum += arr[i];
        }

        double avg = sum/n;

        System.out.println("Sum of elements is : "+sum);
        System.out.println("Average of elements is : "+avg);
    }
}