//Find maximum & minimum element in an array.

import java.util.Scanner;

public class Q02
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
        
        int max = arr[0];
        int min = arr[0];
        for(int i = 0; i < n; i++)
        {
            if(max < arr[i])
            {
                max = arr[i];
            }

            if(min > arr[i])
            {
                min = arr[i];
            }
        }

        System.out.println("Max : "+max);
        System.out.println("Min : "+min);
    }
}