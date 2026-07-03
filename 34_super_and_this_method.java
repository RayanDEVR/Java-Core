class A
{
    public A()
    {  
        super();
        System.out.println("in A");
        
    }

    public A(int a) 
    {
        this();
        System.out.println("in A int");
    }
}

class B extends A
{
    public B()
    {
        super(2);
        System.out.println("in B");
        
    }

     public B(int b) 
    {
        this();
        System.out.println("in B int");
    }    

    public B(int a, int b, int c)
    {
        this(1);
        System.out.println("in B float");
    }

   
}

class SuperAndThisMethod 
{
public static void main(String[] args) {
    {
        B obj = new B(1,2,3);

    }
}
}