/*
a
b b
c c c
d d d d
*/

public class Q10
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
                    System.out.print(((char)(96+i))+" ");
                }
            }
            System.out.println();
        }
    }
}