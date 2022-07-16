package com.leetcode.a1480;

public class Solution01 {
    
    /*解题思路：
     * 创建一个数组作为返回数组，长度与原数组相同
     * 定义一个变量sumTemp用来存储每次循环中的和变量
     * 做一个两层嵌套循环，第一层循环数组长度次，第二层循环第一层当前索引 i+1 次
     * 第二层索引内计算出当前数组值和并赋值给返回数组
     * 循环结束后返回返回数组 */
    
    public static void main(String[] args) {
//        程序的输入
        int[] num = {3, 1, 2, 10, 1};
//        程序的输出
        int[] result = runningSum(num);
    }
    
    //    主方法，使用的时候需要去掉static
    public static int[] runningSum(int[] nums) {
//        创建返回的数组，长度与原数组一致
        int[] sumNums = new int[nums.length];
        int sumTemp;
        
        
        for (int i = 0; i < nums.length; i++) {
            sumTemp = 0;
            for (int j = 0; j < i + 1; j++) {
                sumTemp = sumTemp + nums[j];
            }
            sumNums[i] = sumTemp;
        }
        
        return sumNums;
    }
}
