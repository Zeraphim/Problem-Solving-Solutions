package com.zeraphim.SpringAPICall.CodingBat.d_Array2;

/*

We'll say that an element in an array is "alone" if there are values before and after it, and those values are different from it. Return a version of the given array where every instance of the given value which is alone is replaced by whichever value to its left or right is larger.

notAlone([1, 2, 3], 2) → [1, 3, 3]
notAlone([1, 2, 3, 2, 5, 2], 2) → [1, 3, 3, 5, 5, 2]
notAlone([3, 4], 3) → [3, 4]

 */

public class notAlone {
    public static void main(String[] args) {
        System.out.println(notAlone(new int[]{1, 2, 3}, 2));
        System.out.println(notAlone(new int[]{1, 2, 3, 2, 5, 2}, 2));
        System.out.println(notAlone(new int[]{3, 4}, 3));
        System.out.println(notAlone(new int[]{1, 1, 1, 2}, 1));
    }

    private static int[] notAlone(int[] nums, int val) {
        for (int i = 0; i < nums.length; i++) {
            if (i < nums.length - 1 && i > 0 && nums[i] == val) {
                if (nums[i-1] == val) {
                    nums[i] = val;
                } else {
                    nums[i] = Math.max(nums[i - 1], nums[i + 1]);
                }
            }

            if (nums[i] == val && i == nums.length - 1) {
                nums[i] = val;
            }
        }

        return nums;
    }

    private static int[] notAloneConcise(int[] nums, int val) {
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] == val && nums[i - 1] != val && nums[i + 1] != val) {
                nums[i] = Math.max(nums[i - 1], nums[i + 1]);
            }
        }
        return nums;
    }

    private static int[] notAloneCopyOf(int[] nums, int val) {
        int[] result = nums.clone();

        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] == val && nums[i - 1] != val && nums[i + 1] != val) {
                result[i] = Math.max(nums[i - 1], nums[i + 1]);
            }
        }

        return result;
    }
}