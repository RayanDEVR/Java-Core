<<<<<<< HEAD
 class Calculator
 {
    public int a(int n1, int n2, int n3)
    {
        return n1 + n2 + n3;
    }

    public int a (int n1, int n2)
    {
        return n1 + n2;
    }

     public double a (double n1, int n2)
    {
        return n1 + n2;
    }
 }

   class MethodOverloading
 {
    
        public static void main(String args[])
     {
       Calculator obj = new Calculator();
       int result = obj.a(3,4,2);
       double result1 = obj.a(3,4);
       System.out.println(result);
       System.out.println(result1);

     }
=======
 class Calculator
 {
    public int a(int n1, int n2, int n3)
    {
        return n1 + n2 + n3;
    }

    public int a (int n1, int n2)
    {
        return n1 + n2;
    }

     public double a (double n1, int n2)
    {
        return n1 + n2;
    }
 }

   class MethodOverloading
 {
    
        public static void main(String args[])
     {
       Calculator obj = new Calculator();
       int result = obj.a(3,4,2);
       double result1 = obj.a(3,4);
       System.out.println(result);
       System.out.println(result1);

     }
>>>>>>> 79af2cbce711fd5671ebfbc64cec77e50d96b67d
 } 