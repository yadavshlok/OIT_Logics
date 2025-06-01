//Program to Find the Sum of Border Elements of a Matrix

import java.util.Scanner;

public class Q39
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
    
    public static int sum(int[][] M)
    {
        int sum = 0;
        for(int i = 0; i < M.length; i++)
        {
            for(int j = 0; j < M[i].length; j++)
            {
                if(i == 0 || j == 0 || i == M.length-1 || j == M[i].length-1)
                {
                    sum += M[i][j];
                }
            }
        }
        return sum;
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

        int ans = sum(matrix);

        System.out.println("Sum of Border Elements : "+ans);
    }
}