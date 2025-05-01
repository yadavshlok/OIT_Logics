public class Q20
{
    public static void main(String[] args)
    {
        int eng = 78;
        int hnd = 56;
        int math = 98;
        int sci = 61;
        int geo = 70;

        int total = eng+hnd+math+sci+geo;

        Double per = total/5.0;

        System.out.println("Total marks are :"+total);
        System.out.println("Percentage is :"+per+"%");
    }
}