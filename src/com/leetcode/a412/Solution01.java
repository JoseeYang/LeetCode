package com.leetcode.a412;

import java.util.ArrayList;
import java.util.List;

public class Solution01 {
    /* 解题思路：
    * 创建一个ArrayList对象，对每一位数字将进行判断
    * 如果该数字是15的倍数，就输入fizzBuzz
    * 如果该数字是3的倍数，就输入Fizz
    * 如果该数字是5的倍数，就输入Buzz
    * 执行用时：1 ms
    * 内存消耗：42.9 MB */
    
    public static void main(String[] args) {
        fizzBuzz(15);
    }
    
    
    //    主方法体
    public static List<String> fizzBuzz(int n) {
//        定义多态ArrayList
        List<String> answer = new ArrayList<>();
        
//        对每一个数进行判断
        for (int i = 0; i < n; i++) {
            if ((i + 1) % 15 == 0) {
                answer.add("FizzBuzz");
            } else if ((i + 1) % 3 == 0) {
                answer.add("Fizz");
            } else if ((i + 1) % 5 == 0) {
                answer.add("Buzz");
            } else {
                answer.add((i + 1) + "");
            }
        }
        
//        断点处
        return answer;
    }
}
