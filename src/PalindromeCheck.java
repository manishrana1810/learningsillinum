import java.util.Scanner;
public class PalindromeCheck
{
    public Boolean Check(int n)
    {
        int digits,a;
        int reverse=0;
        a=n;
        digits=0;
        do {
             a=a/10;
             digits++;
        }while(a>0);
        a=n;
        reverse+=a%10;
        for(int i=1;i<digits;i++)
        {
            reverse=reverse*10;
            a=a/10;
            reverse=reverse+(a%10);

        }
        System.out.println("Original number = "+n);
        System.out.println("Reverse number = "+reverse);
        if(n==reverse)
            return true;
        else
            return false;

    }
    public static void main(String[] args)
    {
        int n;
        Scanner s=new Scanner(System.in);
        PalindromeCheck p=new PalindromeCheck();
        System.out.println("Please enter any number =");
        n=s.nextInt();
        if(p.Check(n))
            System.out.println("Number is a Palindrome Number");
        else
            System.out.println("Number is not a Palindrome Number");

    }

}
