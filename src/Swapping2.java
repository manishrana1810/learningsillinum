import java.util.Scanner;
public class Swapping2
{
    public void swap(int a,int b)
    {
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("Value of a is now = "+a);
        System.out.println("Value of b is now = "+b);
    }
    public static void main(String[] args)
    {
        int a,b;
        Scanner s=new Scanner(System.in);
        Swapping2 obj=new Swapping2();
        System.out.println("Please enter first number");
        a=s.nextInt();
        System.out.println("Please enter second number");
        b=s.nextInt();
        obj.swap(a,b);

    }
}
