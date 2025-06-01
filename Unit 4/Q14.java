//Binary Search: Accept sorted array & perform binary search.

import java.util.Scanner;

public class Q14
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

        System.out.print("Enter key to search : ");
        int key = sc.nextInt();

        int s = 0;
        int e = arr.length - 1;
        boolean isFound = false;
        while(s <= e)
        {
            int m = (s+e)/2;
            if(arr[m] == key)
            {
                isFound = true;
                break;
            }
            else if(arr[m] < key)
            {
                s = m + 1;
            }
            else
            {
                e = m - 1;
            }
        }

        if(isFound)
        {
            System.out.println(key+" found");
        }
        else
        {
            System.out.println(key+" NOT found");

        }
    }
}