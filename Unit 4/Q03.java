//Accept array from user & print prime numbers from array.

import java.util.Scanner;

public class Q03
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

        System.out.print("\nPrime Numbers : ");
        for(int i = 0; i < n; i++)
        {
            int j = 2;
            boolean isPrime = true;
            while(j <= Math.sqrt(arr[i]))
            {
                if(arr[i] % j == 0)
                {
                    isPrime = false;
                    break;
                }
                j++;
            }
            if(isPrime)
            {
                System.out.print(arr[i]+" ");
            }
        }
    }
}