public class thisexample1 {
    public thisexample1()
    {
        this(1,2,3);
        System.out.println("Default constructor");
    }
    public thisexample1(int a)
    {
        this();
        System.out.println("One parameter constructor");
    }
    public thisexample1(int a,int b)
    {
        this(1);
        System.out.println("Two parameter constructor");
    }
    public thisexample1(int a,int b, int c)
    {
        System.out.println("Three constructor constructor");
    }
    public thisexample1(int a,int b,int c,int d)
    {
        this(1,2);
        System.out.println("Four parameterized constructor");
    }

    public static void main(String[] args)
    {
        thisexample1 obj1=new thisexample1(1,2,3,4);
    }
}
