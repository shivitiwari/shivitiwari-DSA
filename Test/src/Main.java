//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 5, 6, 7};
        //same array 1st-even no, then odd no's
        //o/p:261357
        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            while (left < right && array[left] % 2 == 0) left++;
            while (left < right && array[right] % 2 != 0) right--;
            if (left < right) {
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;
            }
        }
        for (int num : array) {
            System.out.print(num);
        }
    }
}