//Remove numbers containing zeros from an array.

import java.util.Scanner;

public class Q35
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

        boolean[] visited = new boolean[n];
        int[] arr2 = new int[n];
        System.out.println("After removing numbers containing 0 : ");
        int idx = 0;
        for(int i = 0; i < n; i++)
        {
            int num = arr[i];
            int cnt = 0;
            while(num > 0)
            {
                int digit = num % 10;
                if(digit == 0)
                {
                    cnt++;
                }
                num /= 10;
            }
            if(cnt == 0)
            {
                arr2[idx++] = arr[i];
            }
        }
        for(int i = 0; i < idx; i++)
        {
            System.out.print(arr2[i]+" ");
        }
    }
}