//Program to Swap Two Rows of a Matrix

import java.util.Scanner;

public class Q44
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

    public static void copy(int[] arr, int[] brr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = brr[i];
        }
    }

    public static void swap(int[] R1,int[] R2)
    {
        if(R1.length == R2.length)
        {
            int[] temp = new int[R1.length];
            copy(temp,R1);
            copy(R1,R2);
            copy(R2,temp);
        }
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

        System.out.println("Before Swap : ");
        print(matrix);

        System.out.print("Enter first row to swap : ");
        int a = sc.nextInt();
        System.out.print("Enter second row to swap : ");
        int b = sc.nextInt();
        swap(matrix[a-1],matrix[b-1]);

        System.out.println("After Swap : ");
        print(matrix);
    }
}