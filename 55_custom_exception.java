class RayanException extends Exception
{
    public RayanException(String str)
    {
        super(str);
    }
}

class CustomException
{
    public static void main(String[] args) 
    {
         int i = 29;
        int j;

        try
        {
            j = 24 / i;
            if (j == 0)
            throw new RayanException("0 isn't a valid number");
            
        }
        
        catch(RayanException e)
        {
            j = 24/1;
            System.out.println("This is a default value " + e);
        }
        
        System.out.println(j);
    }
}