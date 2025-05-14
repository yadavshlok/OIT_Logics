import java.util.Scanner;

public class Q22
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the end : ");
        int n = sc.nextInt();

        int num = 0;
        int i = 1;
        while(i <= n)
        {
            System.out.print(i+" ");
            i += num;
        }
        
    }
}