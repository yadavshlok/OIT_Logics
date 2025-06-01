//Program to Count the Number of Prime Numbers in a Matrix

import java.util.Scanner;

public class Q42
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
    
    public static void prime(int[][] M)
    {
        System.out.print("Prime numbers count : ");
        int cnt = 0;
        for(int i = 0; i < M.length; i++)
        {
            for(int j = 0; j < M[i].length; j++)
            {
                boolean isPrime = true;
                int k = 2;
                while(k <= M[i][j]/2)
                {
                    if(M[i][j] % k == 0)
                    {
                        isPrime = false;
                    }
                    k++;
                }
                if(isPrime)
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

        prime(matrix);
    }
}