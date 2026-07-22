import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

class SetDemo {
    public static void main(String[] args) {
        Set<Integer> nums = new HashSet<Integer>();
        
        nums.add(37);
        nums.add(16);
        nums.add(98);
        nums.add(24);
        nums.add(16);

        for (int n : nums)
        {
            System.out.println(n);
        }

// ---------------------------------------------------------------------------

        System.out.println();

        Set<Integer> nums1 = new TreeSet<Integer>();
        
        nums1.add(37);
        nums1.add(16);
        nums1.add(98);
        nums1.add(24);
        nums1.add(16);

        for (int n1 : nums1)
        {
            System.out.println(n1);
        }
    }
}
