//Accept array from user & print palindrome numbers from array.

import java.util.Scanner;

public class Q06
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

        System.out.print("\nPalindrome numbers : ");
        for(int i = 0; i < n; i++)
        {
            int rev = 0;
            int num = arr[i];
            while(num > 0)
            {
                int digit = num % 10;
                rev = rev*10 + digit;
                num /= 10;
            }

            if(arr[i] == rev)
            {
                System.out.print(arr[i]+" ");
            }
        }
    }
}