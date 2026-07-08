abstract class A 
{
    public abstract void show();
}


class AbstractAndAnonymousInnerClass 
{
    public static void main (String[] args)
    {
        A obj = new A()
        {
            public void show()
            {
                System.out.println("showing...");
            }
        };

        obj.show();
    }    
}
