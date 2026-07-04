class A 
 {
     public int show(int a, int b) 
    {
        return a + b;
    }
}

class B extends A 
{
    public int show(int a, int b) 
    {
        return a - b;
    }
}

class MethodOverriding 
{
  public static void main (String [] args)
    {
        B obj = new B();
        int a1 = obj.show(4,2);
        System.out.println(a1);
    }
}
