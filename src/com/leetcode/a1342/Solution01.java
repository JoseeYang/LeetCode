package com.leetcode.a1342;

public class Solution01 {
    /* 解题思路：
     * 计数器思想，对sum进行判断，分别有奇数和偶数的对应方法，直到sum=0
     *
     * 执行用时：0ms
     * 内存消耗：38.2MB */
    public static void main(String[] args) {
//        程序的输入
        int num = 123;
        
        numberOfSteps(num);
    }
    
    //    主方法体
    public static int numberOfSteps(int num) {
        int result = 0;

//        无限循环，直到mun为0
        while (num != 0) {
//            偶数就除以二，计数器加1
            if (num % 2 == 0) {
                num = num / 2;
            } else {
                num = num - 1;
            }
            result++;
        }
//        调试断点处
        return result;
    }
}
