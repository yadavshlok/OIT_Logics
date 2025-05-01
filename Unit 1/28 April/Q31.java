import java.util.*;

public class Q31
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value : ");
        int mtlr = sc.nextInt();

        int ltr = mtlr/1000;

        System.out.println(mtlr+" mililitre = "+ltr+" litre");
    }
}