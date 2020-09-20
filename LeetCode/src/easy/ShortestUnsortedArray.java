package easy;

public class ShortestUnsortedArray {
    public static void main(String[] args) {

        int[] arr = new int[]{2, 6, 4, 8, 10, 9, 15};
        System.out.println(findUnsortedSubarray(arr));
    }


    public static int findUnsortedSubarray(int[] nums) {

        int startIndex; // start position  of  checking
        int endIndex; // end position  of  checking
        int len = nums.length;
        int counter = 0;
        for (int i = 0; i < len; i++) {
            startIndex = i;
            endIndex = (len - 1) - i;
            if (startIndex == endIndex)
                break;

            for (int j = startIndex; j <= endIndex; j++) {
                if (nums[startIndex] >= nums[j]) {
                    // swap items
                    int temp = nums[j];
                    nums[j] = nums[startIndex];
                    nums[startIndex] = temp;

                } else {
                    counter++;
                }
                if (nums[endIndex] <= nums[j]) {
                    // swap items
                    int temp = nums[j];
                    nums[j] = nums[endIndex];
                    nums[endIndex] = temp;
                } else {
                    counter++;
                }
            }

        }
        return counter;

    }
}
