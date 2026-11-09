public class peakIndexInMountainArray {

    public int peakIndexInMountainArray(int[] arr) {
        // int max = arr[0];
        // int index = 0;

        // for (int i = 1; i < arr.length; i++) {

        // if (arr[i] > max) {
        // max = arr[i];
        // index = i;
        // }
        // }

        // return index;

        int low = 0;

        int high = arr.length - 1;

        int ans = -1;

        while (low < high) {

            int mid = low + (high - low) / 2;

            if (arr[mid] < arr[mid + 1]) {

                low = mid + 1;

            } else {
                ans = high;

                high = mid - 1;

            }

        }
        return ans;

    }

}