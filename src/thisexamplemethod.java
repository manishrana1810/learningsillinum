public class thisexamplemethod
{
    public void m1()
    {
        System.out.println("Default Method");
        this.m3(1,2);
    }
    public void m2(int a)
    {
        System.out.println("One parameterized Method");
        this.m5(1,2,3,4);
    }
    public void m3(int a, int b)
    {
        System.out.println("Two parameterized method");
        this.m2(1);
    }
    public void m4(int a,int b,int c)
    {
        System.out.println("Three parameterized method");
        this.m1();

    }
    public void m5(int a,int b,int c,int d)
    {
        System.out.println("Four parameterized method");
    }

    public static void main(String[] args)
    {
        thisexamplemethod obj1=new thisexamplemethod();
        obj1.m4(1,2,3);



    }
}
