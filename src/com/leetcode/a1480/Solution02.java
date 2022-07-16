package com.leetcode.a1480;

public class Solution02 {
    /* 该方法来自力扣0ms范例
    * 思路分析：
    * 创建返回数组，长度与原数组相同
    * 返回数组的第一位和原数组的第一位相同
    * 循环 长度-1 次，每次的新值都是当前 索引-1 的值加上当前索引的值
    * 把这个值赋给返回数组 */
    public static void main(String[] args) {
//        程序的输入
        int[] num = {3, 1, 2, 10, 1};
//        程序的输出
        int[] result = runningSum(num);
    }
    
    
    public static int[] runningSum(int[] nums) {
        int[] results = new int[nums.length];
        results[0] = nums[0];
        for (int index = 1; index < nums.length; index++) {
            results[index] = results[index - 1] + nums[index];
        }
        
        return results;
    }
}
