package easy;

public class NonDecreasingArray {

    public static void main(String[] args) {

        int[] arr = new int[]{3, 4, 2, 3};
        System.out.println(checkPossibility(arr));
    }

    public static boolean checkPossibility(int[] nums) {

        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1])
                count++;

        }
        return count == 1;

    }
}
