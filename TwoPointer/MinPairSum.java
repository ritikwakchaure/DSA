
import java.util.*;

public class MinPairSum {

    public int minPairSum(int nums[]) {

        Arrays.sort(nums);
        int i = 0, j = nums.length - 1;
        int total = 0;
        while (i < j) {

            int sum = nums[i] + nums[j];

            // total = Math.max(total, sum);
            if (total < sum) {
                total = sum;

            } else {
                total = total;
            }
            i++;
            j--;

        }
        return total;

    }

    public static void main(String[] args) {

        MinPairSum obj = new MinPairSum();

        int[] arr = { 3, 5, 4, 2, 4, 6 };

        int result = obj.minPairSum(arr);
        System.out.println("Result: " + result);
        
    }

}
