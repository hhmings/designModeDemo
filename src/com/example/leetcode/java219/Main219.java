package com.example.leetcode.java219;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author houhaimin
 * @version 1.0
 * @date 2019/8/28 21:21
 */
public class Main219 {


    public static void main(String[] args) {

//        int[] nums = {1,2,3,1};
        int[] nums = {1,2,3,1,2,3};
        int k = 2;
        System.out.println(containsNearbyDuplicate(nums,k));
    }


    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        if (nums.length <=0 || k < 0){
            return false;
        }
        int len = nums.length;
        Set<Integer> set = new HashSet<>(len);
        for (int i = 0; i < len; i++) {
            if (set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);
            if (set.size() > k){
                set.remove(nums[i-k]);
            }
        }
        return false;
    }
}
