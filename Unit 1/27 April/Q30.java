import java.util.*;
public class Q30
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.print("enter a hrs: ");
        int h=sc.nextInt();

        System.out.print("enter a min: ");
        int m=sc.nextInt();

        System.out.print("enter a sec: ");
        int s=sc.nextInt();

        int total=(h*3600)+(m*60)+(s);

        System.out.println("Total seconds are "+total);
    }
}