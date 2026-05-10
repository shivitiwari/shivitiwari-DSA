//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int peak = findPeakElement(nums);
        System.out.println(peak);
    }

    public static int findPeakElement(int[] nums) {
        //peak element is element which is greater than it's left and right element.
        int n = nums.length;

        if (n == 1) return 0;

        if (nums[0] > nums[1]) return 0;
//        if (nums.length == 2) {
//            return (nums[0] > nums[1]) ? 0 : 1;
//        }
        int left = 0;
        int right = 0;
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] > nums[i - 1] && nums[i] > nums[i + 1]) {
                return i;
            }
        }
        if (nums[n - 1] > nums[n - 2]) return n - 1;
        return -1;
    }
}