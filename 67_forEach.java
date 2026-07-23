import java.util.Arrays;
import java.util.List;

class ForEach 
{
    public static void main(String[] args) 
    {
        List<Integer> nums = Arrays.asList(4, 5, 7, 2, 3, 8);

        nums.forEach(n -> System.out.println(n));

        
        // Consumer<Integer> con = new Consumer<Integer>()          //behind the scene
        // {              
        //     public void accept(Integer n) 
        //     {
        //         System.out.println(n);
        //     }
        // };
        // nums.forEach(con);


    }
}
