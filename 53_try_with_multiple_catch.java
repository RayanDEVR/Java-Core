class TryWithMultipleCatch
{
    public static void main(String[] args) 
    {
        int i = 3;
        int j = 5;
        int nums[] = { 1, 6, 8, 9, 6 };

        try
        {
            j = 24 / i;
            System.out.println(nums[6]);
        }
        
        catch(ArithmeticException e)
        {
            System.out.println("Can't divite by 0");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Select a number between 0-4");
        }
        catch(Exception e)
        {
            System.out.println("Something is wrong ");
        }

        System.out.println(j);
        System.out.println(nums[3]);
    }
}