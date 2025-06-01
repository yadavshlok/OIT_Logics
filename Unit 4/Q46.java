//Program to Reverse Each Row of a Matrix

import java.util.Scanner;

public class Q46
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

    public static void reverse(int[] arr)
    {
        int s = 0;
        int e = arr.length-1;
        while(s < e)
        {
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            e--;
            s++;
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

        for(int i = 0; i < m; i++)
        {
            reverse(matrix[i]);
        }

        System.out.println("After Swap : ");
        print(matrix);
    }
}