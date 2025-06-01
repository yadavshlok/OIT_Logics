//Accept array & print even and odd numbers separately.

import java.util.Scanner;

public class Q10
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

        System.out.print("\nEven Numbers : ");
        for(int i = 0; i < n; i++)
        {
            if(arr[i] % 2 == 0)
            {
                System.out.print(arr[i]+" ");
            }
        }
        System.out.print("\nOdd Numbers : ");
        for(int i = 0; i < n; i++)
        {
            if(arr[i] % 2 != 0)
            {
                System.out.print(arr[i]+" ");
            }
        }
    }
}