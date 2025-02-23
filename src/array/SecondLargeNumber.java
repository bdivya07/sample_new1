package array;

import java.util.Arrays;

public class SecondLargeNumber {
	
	public static void main(String[] args) {
		SecondLargeNumber s =new SecondLargeNumber();
		//int aa[] = {1,1,9,5}; //1,5,1,9
		//int aa[] = {2,3,1,3,3}; //2,3,3,1,3
		//int aa[] = {7,8,9}; //7,9,8
		int aa[] = {7,8,9,2}; //7,9,2,8
		s.nextPermutation(aa);
	}
	public void nextPermutation(int[] nums) {
        int i = nums.length - 2;
        while (i >= 0 && nums[i + 1] <= nums[i]) {
            i--;
        }
        if (i >= 0) {
            int j = nums.length - 1;
            while (j >= 0 && nums[j] <= nums[i]) {
                j--;
            }
            swap(nums, i, j);
        }
        reverse(nums, i + 1);
        
        System.out.println(Arrays.toString(nums));
    }

    private void reverse(int[] nums, int start) {
        int i = start, j = nums.length - 1;
        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

}
