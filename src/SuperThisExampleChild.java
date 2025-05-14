public class SuperThisExampleChild extends SuperThisExample
{
    public SuperThisExampleChild()
    {
        this(1,2,3);
        System.out.println("Child Class Default Constructor");
    }
    public SuperThisExampleChild(int a)
    {
        this();
        System.out.println("Child Class 1 parametrized Constructor");
    }
    public SuperThisExampleChild(int a,int b)
    {
        this(3);
        System.out.println("Child Class 2 parameterized constructor");
    }
    public SuperThisExampleChild(int a,int b,int c)
    {
        super(1);
        System.out.println("Child Class 3 parameterized constructor");
    }

    public static void main(String[] args)
    {
        SuperThisExampleChild C=new SuperThisExampleChild(2,3);

    }
}

