package com.leetcode.a412;

import java.util.ArrayList;
import java.util.List;

public class Solution01 {
    /* ����˼·��
    * ����һ��ArrayList���󣬶�ÿһλ���ֽ������ж�
    * �����������15�ı�����������fizzBuzz
    * �����������3�ı�����������Fizz
    * �����������5�ı�����������Buzz
    * ִ����ʱ��1 ms
    * �ڴ����ģ�42.9 MB */
    
    public static void main(String[] args) {
        fizzBuzz(15);
    }
    
    
    //    ��������
    public static List<String> fizzBuzz(int n) {
//        �����̬ArrayList
        List<String> answer = new ArrayList<>();
        
//        ��ÿһ���������ж�
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
        
//        �ϵ㴦
        return answer;
    }
}
