import java.util.Scanner;
public class ArmstrongCheck
{
    public boolean Check(int n)
    {
        int a,b,c,d;
        int deno = 10;
        int digits=0;
        a=n;
        d=0;
        do
        {
            digits=digits+1;
            a=a/10;
        }while(a>0);
        System.out.println("Number of Digits of number is ="+digits);
         a=n;
        for (int i=1;i<=digits;i++)
        {
            b=a%deno;
            c=1;
           for (int j=1;j<=digits;j++)
              c=c*b;
           d=d+c;
           a=a/10;

        }
        if(d==n)
            return true;
        else
            return false;
    }
    public static void  main(String[] args)
    {
        int n;
        Scanner s=new Scanner(System.in);
        ArmstrongCheck obj=new ArmstrongCheck();
        System.out.println("Please enter a number to check =");
        n=s.nextInt();
        if(obj.Check(n))
            System.out.println("Number is Armstrong number");
        else
            System.out.println("Number is not a Armstrong number");

    }
}
