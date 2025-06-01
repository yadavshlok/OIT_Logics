//Print duplicate elements in an array.

import java.util.Scanner;

public class Q27
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
        System.out.println("Duplicates : ");
        for(int i = 0; i < n; i++)
        {
            if(!visited[i])
            {
                int cnt = 1;
                for(int j = i+1; j < n; j++)
                {
                    if(arr[i] == arr[j])
                    {
                        System.out.println(arr[i]);
                        visited[j] = true;
                    }
                }
            }
        }
    }
}