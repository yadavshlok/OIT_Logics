public class Q21
{
    public static void main(String[] args)
    {
        Double amt = 10000.0;
        Double rate = 2.0;
        Double time = 5.0;

        Double si = (amt*rate*time)/100.0;

        Double newamt = amt*Math.pow(1+rate/100,time);
        Double ci = newamt-amt;

        System.out.println("Simple interest is :"+si+"\nCompound interest is :"+ci);
    }
}