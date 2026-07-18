class ThrowKeyword 
{
    public static void main(String[] args) 
    {
        int i = 29;
        int j;

        try
        {
            j = 24 / i;
            if (j == 0)
            throw new ArithmeticException("0 isn't a valid number");
            
        }
        
        catch(ArithmeticException e)
        {
            j = 24/1;
            System.out.println("This is a default value " + e);
        }
        
        System.out.println(j);
    }    
}
