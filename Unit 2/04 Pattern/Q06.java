/*
1
2 3
4 5 6
7 8 9 10
*/

public class Q06
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
                    num ++;
                }   
            }
            System.out.println();
        }
    }
}