class A 
{
    public void show()
    {
        System.out.println("showing...");
    }

    class B
    {
        public void type()
        {
            System.out.println("typing...");
        }
    }
}


class InnerClass
 {
     public static void main(String[] args) 
    {
        A obj = new A();
        obj.show();

        A.B obj1 = obj.new B();
        obj1.type();
        
    }
 }
