import java.util.Arrays;
import java.util.Scanner;

class Solution {
    public static void moveZeroes(int[] nums) {
        int lastNonZeroFoundAt = 0;

        for (int current = 0; current < nums.length; current++) {
            if (nums[current] != 0) {
                int temp = nums[current];
                nums[current] = nums[lastNonZeroFoundAt];
                nums[lastNonZeroFoundAt] = temp;
                lastNonZeroFoundAt++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int nums[] = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
}