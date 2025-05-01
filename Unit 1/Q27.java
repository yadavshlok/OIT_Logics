//write a program to perform swapping of two number with by using bitwise operator

public class Q27
{
    public static void main(String[] args)
    {
        int a = 10;
        int b = 20;

        System.out.println("Before swap a :"+a+" b :"+b);

        a = a^b;
        b = a^b;
        a = a^b;

        System.out.println("After swap a :"+a+" b :"+b);
    }
}