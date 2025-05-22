/*
a
a b
a b c
a b c d
a b c
a b
a
*/

public class Q18
{
    public static void main(String[] args)
    {
        int n = 4;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(i >= j)
                {
                    System.out.print((char)(96+j)+" ");
                }
            }
            System.out.println();
        }
        for(int i=n-1;i>=1;i--)
        {
            for(int j=1;j<=n;j++)
            {
                if(i >= j)
                {
                    System.out.print((char)(96+j)+" ");
                }
            }
            System.out.println();
        }
    }
}