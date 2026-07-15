class ExceptionHandling
{
    public static void main(String[] args) 
    {
        int i = 0;
        int j = 10;

        try
        {
            j=20/i;                 //Exception
        } 
        catch(Exception e)
        {
            System.out.println("something is wrong");
        }

        System.out.println(j);

        System.out.println("Bye");
    }
}