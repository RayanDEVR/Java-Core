import java.util.Scanner;

class UseOfScanner
{
    public static void main(String[] args) 
    {
        System.out.println("Enter a Number");

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println(num);

        sc.close();
    }    
}
