import java.util.Scanner;

public class FibonacciPrint
{
    public void PrintFebo(int n)
    {
        int a=0;
        int b=1;
        int sum;
        sum=a+b;

            for(int i=1;i<=n;i++)
            {
                    sum=a+b;
                    System.out.print(" "+a);
                    a=b;
                    b=sum;


            }
    }
    public static void main(String[] args)
    {
        int n;
        FibonacciPrint F=new FibonacciPrint();
        Scanner s=new Scanner(System.in);
        System.out.println("How many Fibonacci number you want to print = ");
        n=s.nextInt();
        F.PrintFebo(n);

    }
}
