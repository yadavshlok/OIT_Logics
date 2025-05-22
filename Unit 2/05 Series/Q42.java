//Compute the cosine series : 1/2 + 3/4 + 5/6 +……… + n/n+1


import java.util.Scanner;

public class Q42
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();

        double sum = 0;
        for(int i = 1;i <= n;i += 2)
        {
            double add = (double)i/(i+1);
            sum += add;
        }
        System.out.println("Sum : "+sum);

    }
}