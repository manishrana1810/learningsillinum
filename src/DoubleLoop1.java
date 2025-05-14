

public class DoubleLoop1
{
    public void Pattern()
    {
        System.out.println("First Assignment");
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
                System.out.print("*");
            System.out.println();
        }
        System.out.println("Second Assignment");
        for(int i=5;i>=1;i--)
        {
            for(int j=i;j>=1;j--)
                System.out.print("*");
            System.out.println();
        }
        System.out.println("Third Assignment");
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
                System.out.print(j);
            System.out.println();
        }
        System.out.println("Forth Assignment");
        {
            int k=1;
            for(int i=1;i<=5;i++)
            {

                for(int j=1;j<=i;j++)
                {
                    System.out.print(k+" ");
                    k++;
                }
                System.out.println();
            }
        }
        System.out.println("Fifth Assignment");
        for(int i=1;i<=5;i++)
        {
            for(int j=i;j<=5;j++)
                System.out.print(" ");
            for(int k=1;k<=i;k++)
                System.out.print("* ");
            System.out.println();
        }
        System.out.println("Sixth Assignment");
        for(int i=1;i<=5;i++)
        {
            for(int j=i;j<=5;j++)
                System.out.print(" ");
            for(int k=1;k<=i;k++)
                System.out.print("*");
            System.out.println();
        }

    }
    public static void main(String[] args)
    {
        DoubleLoop1 D=new DoubleLoop1();
        D.Pattern();
    }
}
