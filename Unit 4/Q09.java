//Accept array from user & print dicerium numbers from array.

import java.util.Scanner;

public class Q09
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

        System.out.print("\nDicerium numbers : ");
        for(int i = 0; i < n; i++)
        {
            int num = arr[i];
            int pow = 0;
            while (num > 0){
                num /= 10;
                pow++;
            }
            num = arr[i];
            int sum = 0;
            while(num > 0)
            {
                int digit = num % 10;
                sum += Math.pow(digit,pow);
                num /= 10;
                pow--; 
            }

            if(sum == arr[i])
            {
                System.out.println(arr[i]+" ");
            }
        }
    }
}