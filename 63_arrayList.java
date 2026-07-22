import java.util.List;
import java.util.ArrayList;

class ArrayListDemo
{
    public static void main(String[] args) {
        
        List<Integer> nums = new ArrayList<Integer>();

        nums.add(3);
        nums.add(5);
        nums.add(7);
        nums.add(9);
        nums.add(1);


        System.out.println(nums.get(3));
        System.out.println(nums);
        
        for (int n : nums)
        {
            System.out.println(n);
        }
    }
}