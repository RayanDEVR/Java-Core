class A
{
    public A()
    {  
        super();
        System.out.println("in A");
        
    }

    public A(char a) 
    {
        super();
        System.out.println("in A int");
    }
}

class B extends A
{
    public B()
    {
        super('a');
        System.out.println("in B");
        
    }

    public B(char b) 
    {
        this();
        System.out.println("in B int");
    }
}

class SuperAndThisMethod
{
public static void main(String[] args) {
    {
        B obj = new B();

        System.out.println();

        B obj1 = new B('f');

    }
}
}