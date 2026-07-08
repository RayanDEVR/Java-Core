
class A 
{
    public void show()
    {
        System.out.println("showing...");
    }
}

class AnnonymousInnerClass 
{
    public static void main (String[] args)
    {
        A obj = new A()
        {
            public void show()
            {
                System.out.println("new showing...");
            }
        };
        
        obj.show();

    }
}
