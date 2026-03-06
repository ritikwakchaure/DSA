public class RemoveDuplicate {

    public int removeDuplicate(int nums[]) {
        int n = nums.length;
        int i = 0, j = 1;

        while (j < n) {
            if (nums[i] != nums[j]) {

                nums[++i] = nums[j];
            }
            j++;
        }
        return i + 1;

    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 3, 3, 4, 5 };
        RemoveDuplicate R1 = new RemoveDuplicate();
        int k = R1.removeDuplicate(arr);

        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }

    }

}
