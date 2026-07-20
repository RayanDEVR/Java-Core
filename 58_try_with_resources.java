import java.io.IOException;
import java.util.Scanner;

class TryWithResources 
{
    public static void main(String[] args) throws NumberFormatException, IOException 
    {
        int num;
        System.out.println("Enter a number");

        Scanner sc = new Scanner(System.in);
        try
        {
            num = sc.nextInt();
            System.out.println(num);
        }
        catch(Exception e)
        {
            System.out.println("Please enter a valid number");
        }
        finally
        {
            sc.close();
        }
        
    }    
}
