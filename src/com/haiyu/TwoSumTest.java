package com.haiyu;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Desc: 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 *
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/two-sum
 *
 * @Author: liuxing
 * @Date: 2020/5/13 22:39
 * @Version 1.0
 */
public class TwoSumTest {

    public static void main(String[] args) {

    }

    private static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer,Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int other = target - nums[i];
            if(hashMap.containsKey(other)){
                int value = hashMap.get(other);
                result[0] = i < value ? i : value;
                result[1] = i > value ? i : value;
                break;
            }
            hashMap.put(nums[i],i);
        }
        return result;
    }



}
