//Implement Bubble Sort algorithm.

import java.util.Scanner;

public class Q22
{
    public static void sort(int[] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr.length-1;j++)
            {
                if(arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    
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
         
        System.out.print("\nBefore sorting : ");
        for(int i = 0; i < n; i++)
        {
            System.out.print(arr[i] + " ");
        }

        sort(arr);

        System.out.print("\nAfter sorting : ");
        for(int i = 0; i < n; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}