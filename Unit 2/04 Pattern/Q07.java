/*
A
A B
A B C
A B C D
*/

public class Q07
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
                    System.out.print(((char)(64+j))+" ");
                }
            }
            System.out.println();
        }
    }
}