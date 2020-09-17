package easy;

public class RemoveDuplicateFromArray {
    public static void main(String[] args) {

        int[] arr = new int[]{1, 1, 1, 2, 2, 3, 3, 4, 4};
        System.out.println(removeDuplicates(arr));
    }

    public static int removeDuplicates(int[] nums) {

        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[res] != nums[i])
                nums[++res] = nums[i];

        }
        return res + 1;

    }


}
