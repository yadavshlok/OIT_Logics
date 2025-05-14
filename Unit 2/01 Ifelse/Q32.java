/*Accept marks in three subjects, if marks in each subject ≥ 40, then display class, else print
fail/ATKT.*/

import java.util.Scanner;

public class Q32
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

        if(a >= 40 && b >= 40 && c >= 40)
        {
            if(a >= 80 && b >= 80 && c >= 80)
            {
                System.out.println("Class : Distinction");
            }
            else if(a >= 60 && b >= 60 && c >= 60 )
            {
                System.out.println("Class : First class");
            }
            else if(a >= 50 && b >= 50 && c >= 50)
            {
                System.out.println("Class : Second class");
            }
            else if(a >= 40 && b >= 40 && c >= 40)
            {
                System.out.println("Class : Pass");
            }
        }
        else
        {
            System.out.println("Class : Fail/ATKT");
        }
    }
}