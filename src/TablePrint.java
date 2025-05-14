import java.util.Scanner;
public class TablePrint
{
    public void Table(int n)
    {
        for(int i=1;i<=10;i++)
         System.out.println(n+" * "+i+" = "+n*i);
    }
    public static void main(String[] args)
    {
        TablePrint t=new TablePrint();
        Scanner s=new Scanner(System.in);
        int n;
        System.out.print("Please Enter a number = ");
        n=s.nextInt();
        t.Table(n);
    }
}
