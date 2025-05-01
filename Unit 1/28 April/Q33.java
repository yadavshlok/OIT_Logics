import java.util.*;

public class Q33
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter seconds :");

        int sec = sc.nextInt();

        int hr = sec/3600;
        int min = (sec%3600)/60;
        int secc = sec % 60;

        System.out.println("H:M:S "+hr+":"+min+":"+secc);
    }
}