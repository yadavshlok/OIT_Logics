//Accept cost price and selling price, then find profit/loss in percentage/amount.

import java.util.Scanner;

public class Q12
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter cost price : ");
        double cp = sc.nextDouble();

        System.out.print("Enter selling price : ");
        double sp = sc.nextDouble();

        if(sp > cp)
        {
            System.out.println("Profit!!");
            double pa = sp-cp;
            System.out.println("Profit Amount : "+pa);
            double pp = pa/cp *100;
            System.out.println("Profit Percentage : "+pp);
        }
        else
        {
            System.out.println("Loss!!");
            double la = cp-sp;
            System.out.println("Loss Amount : "+la);
            double lp = la/cp *100;
            System.out.println("Loss Percentage : "+lp);
        } 
    }
}