//Accept n subjects' marks & calculate result (Pass/Fail/ATKT).

import java.util.Scanner;

public class Q36
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of subjects : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter marks of "+n+" subjects : ");
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }

        int pass = 0;
        for(int i = 0; i < n; i++)
        {
            if(arr[i] >= 40)
            {
                pass++;
            }
        }
        if(pass == n)
        {
            System.out.println("Pass");
        }
        else 
        {
            System.out.println("Fail");            
        }
    }
}