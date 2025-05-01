/**Write a program to multiply and divide two numbers and print them in the form of equation
(4*3=12 8/4=2)? */

public class Q02
{
    public static void main(String[] args)
    {
        int a = 4;
        int b = 3;
        int c = a*b;

        int x = 8;
        int y = 2;
        int z = x/y;

        System.out.println("\n"+a+"*"+b+"="+c+"\n");
        System.out.println(x+"/"+y+"="+z);
    }
}