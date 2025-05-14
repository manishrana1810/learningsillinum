import java.util.Scanner;
public class FactorialFind
{
    public int Factorial(int n)
    {
        int i;
        i=n-1;
        while(i>1)
        {
            n=n*i;
            i=i-1;

        }
        return n;

    }
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        FactorialFind f=new FactorialFind();
        int n;
        System.out.print("Please enter any number = ");
        n=s.nextInt();
        n=f.Factorial(n);
        System.out.println("Factorial of the number is = "+n);

    }
}
