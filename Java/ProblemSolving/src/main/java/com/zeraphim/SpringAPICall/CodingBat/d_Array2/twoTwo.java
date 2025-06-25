package com.zeraphim.SpringAPICall.CodingBat.d_Array2;

/*

Given an array of ints, return true if every 2 that appears in the array is next to another 2.

twoTwo([4, 2, 2, 3]) → true
twoTwo([2, 2, 4]) → true
twoTwo([2, 2, 4, 2]) → false

 */

public class twoTwo {
    public static void main(String[] args) {
        System.out.println(twoTwo(new int[]{4, 2, 2, 3}));
        System.out.println(twoTwo(new int[]{2, 2, 4}));
        System.out.println(twoTwo(new int[]{2, 2, 4, 2}));
    }

    private static boolean twoTwo(int[] nums) {
        if (nums.length < 2) {
            if (nums.length == 0) {
                return true;
            }
            if (nums[0] == 2) {
                return false;
            } else {
                return true;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2) {
                if (i < nums.length - 1 && nums[i+1] != 2) {
                    return false;
                } else {
                    i++;
                }
            }
        }

        if (nums[nums.length - 2] != 2 && nums[nums.length - 1] == 2) {
            return false;
        }

        return true;
    }

    private static boolean twoTwoSimplified(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2) {
                if ((i > 0 && nums[i - 1] == 2) || (i < nums.length - 1 && nums[i + 1] == 2)) {
                    continue;
                } else {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean twoTwoGroupBasedCheck(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2) {
                // If it's the last element or the next one is not 2
                if (i == nums.length - 1 || nums[i + 1] != 2) {
                    // If the previous one is not 2, then it's isolated
                    if (i == 0 || nums[i - 1] != 2) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    private static boolean twoTwoConsecutiveTwos(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            if (nums[i] == 2) {
                int count = 0;
                while (i < nums.length && nums[i] == 2) {
                    count++;
                    i++;
                }
                if (count < 2) return false;
            } else {
                i++;
            }
        }
        return true;
    }

    private static boolean twoTwoFlag(int[] nums) {
        boolean lastWasTwo = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2) {
                if (lastWasTwo) {
                    lastWasTwo = false; // paired
                } else {
                    lastWasTwo = true;
                }
            } else if (lastWasTwo) {
                return false; // previous 2 was unpaired
            }
        }
        return !lastWasTwo; // ensure no leftover unpaired 2
    }

    private static boolean twoTwoRegex(int[] nums) {
        StringBuilder s = new StringBuilder();
        for (int num : nums) s.append(num);
        return !s.toString().matches(".*(?<!2)2(?!2).*");
    }
}