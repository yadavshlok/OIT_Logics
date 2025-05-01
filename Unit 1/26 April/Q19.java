public class Q19
{
    public static void main(String[] args)
    {
        int a = 5;
        int b = 3;
        int c = 4;

        Double s= (a+b+c)/2.0;
        System.out.println("Semi-perimeter is "+s);

        Double num= s*(s-a)*(s-b)*(s-c);

        System.out.println("Area of triangle :"+Math.sqrt(num)+" sq.cm"); 
    }
}