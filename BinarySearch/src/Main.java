//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] list = {-1, 0, 3, 5, 9, 12};
        int target = 9;
        int result = search(list, target);
        System.out.println(result);
    }

    public static int  search(int[] nums, int target) {
        int size= nums.length;
        int start=0;
        int end=size-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target) return mid;
            if(nums[mid]<target) start=mid+1;
            else end=mid-1;
        }
        return -1;
    }

}