

import java.util.Scanner;
public class PrimeNumber
{
    public Boolean PrimeCheck(int a)
    {
        if(a==0 || a==1)
            return false;
        else
            for(int i=2;i<a;i++)
            {
                if (a%i==0)
                    return false;
            }
            return true;

    }

    public static void main(String[] args)
    {
        int a;
        Scanner s=new Scanner(System.in);
        PrimeNumber obj=new PrimeNumber();
        System.out.print("Please enter a number = ");
        a=s.nextInt();
        if(obj.PrimeCheck(a))
            System.out.println(a+" is a prime number");
        else
            System.out.println(a+" is not a prime number");

    }





}
