package com.leetcode.a1672;

public class Solution01 {
    /* 解题思路：
     * 双层for循环
     * 第一层遍历数组的长度，第二层遍历数组二维的长度
     * 把二维的内容相加和返回值相比，把较大值返回给返回值
     * 执行用时：0ms
     * 内存消耗：40.6MB */
    
    public static void main(String[] args) {
//        程序的输入
        int[][] accounts = {{1, 5}, {7, 3}, {3, 5}};
        
        maximumWealth(accounts);
    }
    
    public static int maximumWealth(int[][] accounts) {
        int result = 0;
        int temp = 0;
        
        for (int i = 0; i < accounts.length; i++) {
//            把二维的加起来
            for (int j = 0; j < accounts[i].length; j++) {
                temp = temp + accounts[i][j];
            }
//            如果本次结果较大，就把返回值修改为本次结果
            if (temp > result) {
                result = temp;
            }
            temp = 0;
        }

//        调试断点处
        return result;
    }
}
