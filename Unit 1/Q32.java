//write a program to perform conversion of metres to kilometres

import java.util.*;

public class Q32
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value : ");
        int mtr = sc.nextInt();

        int km = mtr/1000;

        System.out.println(mtr+" meter = "+km+" kilometer");
    }
}