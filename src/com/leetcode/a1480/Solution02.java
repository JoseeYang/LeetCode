package com.leetcode.a1480;

public class Solution02 {
    /* �÷�����������0ms����
    * ˼·������
    * �����������飬������ԭ������ͬ
    * ��������ĵ�һλ��ԭ����ĵ�һλ��ͬ
    * ѭ�� ����-1 �Σ�ÿ�ε���ֵ���ǵ�ǰ ����-1 ��ֵ���ϵ�ǰ������ֵ
    * �����ֵ������������ */
    public static void main(String[] args) {
//        ���������
        int[] num = {3, 1, 2, 10, 1};
//        ��������
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
