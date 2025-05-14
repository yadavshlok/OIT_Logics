//Accept three subject marks from the user and display total, percentage, and class.

import java.util.Scanner;

public class Q30
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks of subject-1 : ");
        int a = sc.nextInt();

        System.out.print("Enter marks of subject-2 : ");
        int b = sc.nextInt();

        System.out.print("Enter marks of subject-3 : ");
        int c = sc.nextInt();

        int total = a+b+c;
        int per = total/3;

        System.out.println("Total marks are : "+total);
        System.out.println("Percentage is : "+per);

        if(per >= 80)
        {
            System.out.println("Class : Distinction");
        }
        else if(per >= 60 )
        {
            System.out.println("Class : First class");
        }
        else if(per >= 50)
        {
            System.out.println("Class : Second class");
        }
        else if(per >= 35)
        {
            System.out.println("Class : Pass");
        }
        else
        {
            System.out.println("Class : Fail");
        }
    }
}