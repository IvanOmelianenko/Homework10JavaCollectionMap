import java.util.ArrayList;
import java.util.List;

public class ArrayListInt {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(5);
        nums.add(4);
        nums.add(3);
        nums.add(2);
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(5);

        int count = counterCatch(nums, 2);
        System.out.println(count);

        }
        public static int counterCatch(ArrayList<Integer> nums, int value) {
            int count = 0;
            for (int num : nums) {
                if (num == value) {
                    count++;
                }
            }
            return  count;
        }
    }

