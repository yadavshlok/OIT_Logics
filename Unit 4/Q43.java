//Program to Count the Number of Palindromic Numbers in a Matrix

import java.util.Scanner;

public class Q43
{
    public static void accept(int[][] M)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter elements : ");
        for(int i = 0; i < M.length; i++)
        {
            for(int j = 0; j < M[i].length; j++)
            {
                M[i][j] = sc.nextInt();
            }
        }
    }

    public static void print(int[][] M)
    {
        for(int i = 0; i < M.length; i++)
        {
            for(int j = 0; j < M[i].length; j++)
            {
                System.out.print(M[i][j]+" ");
            }
            System.out.println();
        }
    }
    
    public static void palindrome(int[][] M)
    {
        System.out.print("Palindrome numbers count : ");
        int cnt = 0;
        for(int i = 0; i < M.length; i++)
        {
            for(int j = 0; j < M[i].length; j++)
            {
                int num = M[i][j];
                int rev = 0;
                while(num > 0)
                {
                    int digit = num % 10;
                    rev = rev*10 + digit;
                    num /= 10;
                }
                if(M[i][j] == rev)
                {
                    cnt++;
                }
            }
        }
        System.out.print(cnt);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of rows : ");
        int m = sc.nextInt();
        System.out.print("Enter no. of cols : ");
        int n = sc.nextInt();

        int[][] matrix = new int[m][n];
        accept(matrix);

        System.out.println("Original Matrix : ");
        print(matrix);

        palindrome(matrix);
    }
}