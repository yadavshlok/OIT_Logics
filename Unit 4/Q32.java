//Find the sum of odd elements in an array.

import java.util.Scanner;

public class Q32
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
            if(arr[i] % 2 != 0)
            {
                sum += arr[i];
            }
        }
        System.out.println("Sum of even elements : "+sum);
    }
}