
import java.util.Scanner;
public class Swapping1
{
    public void swap(int a,int b)
    {
        int c;
        c=b;
        b=a;
        a=c;
        System.out.println("Value of a is now = "+a);
        System.out.println("Value of b is now = "+b);
    }

    public static void main(String[] args)
    {
      int a,b;
      Scanner s=new Scanner(System.in);
      Swapping1 obj=new Swapping1();
      System.out.println("Please enter first number");
      a=s.nextInt();
      System.out.println("Please enter second number");
      b=s.nextInt();
      obj.swap(a,b);

    }
}
