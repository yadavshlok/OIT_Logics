//Print perfect square numbers from an array.

import java.util.Scanner;

public class Q33
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


        System.out.print("\nPerfect square numbers : ");
        for(int i = 0; i < n; i++)
        {
            int sq = (int)Math.sqrt(arr[i]);
            if(sq*sq == arr[i])
            {
                System.out.print(arr[i]+" ");
            }
        }
    }
}