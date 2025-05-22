/*
a       A
b c     B C
d e f   D E F
g h i j G H I J
*/

public class Q11
{
    public static void main(String[] args)
    {
        int cnt1 = 1;
        int cnt2 = 1;
        int n = 4;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(i >= j)
                {
                    System.out.print(((char)(96+cnt1))+" ");
                    cnt1++;
                }
                else
                {
                    System.out.print("  ");
                }
            }
            for(int j=1;j<=n;j++)
            {
                if(i >= j)
                {
                    System.out.print(((char)(64+cnt2))+" ");
                    cnt2++;
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}