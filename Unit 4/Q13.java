//Linear Search: Accept array & search for an element.

import java.util.Scanner;

public class Q13
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

        boolean isFound = false;
        for(int i = 0; i < n; i++)
        {
            if(arr[i] == key)
            {
                isFound = true;
                break;
            }
        }

        if(isFound)
        {
            System.out.print(key+" is found");
        }
        else 
        {
            System.out.print(key+" is NOT found");
        }
    }
}