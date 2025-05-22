/*
1
3 5
7 9 11
13 15 17 19
*/

public class Q05
{
    public static void main(String[] args)
    {
        int num = 1;
        int n = 4;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(i >= j)
                {
                    System.out.print(num+" ");
                    num += 2;
                }   
            }
            System.out.println();
        }
    }
}