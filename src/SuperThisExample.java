public class SuperThisExample
{
    public SuperThisExample()
    {
        this(1,2);
        System.out.println("Parent Class Default Constructor");
    }
    public SuperThisExample(int a)
    {
        this(1,2,3);
        System.out.println("Parent Class 1 parametrized Constructor");
    }
    public SuperThisExample(int a,int b)
    {
        System.out.println("Parent Class 2 parameterized constructor");
    }
    public SuperThisExample(int a,int b,int c)
    {
        this();
        System.out.println("Parent Class 3 parameterized constructor");
    }
}


