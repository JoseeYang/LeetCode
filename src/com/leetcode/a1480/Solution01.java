package com.leetcode.a1480;

public class Solution01 {
    
    /*����˼·��
     * ����һ��������Ϊ�������飬������ԭ������ͬ
     * ����һ������sumTemp�����洢ÿ��ѭ���еĺͱ���
     * ��һ������Ƕ��ѭ������һ��ѭ�����鳤�ȴΣ��ڶ���ѭ����һ�㵱ǰ���� i+1 ��
     * �ڶ��������ڼ������ǰ����ֵ�Ͳ���ֵ����������
     * ѭ�������󷵻ط������� */
    
    public static void main(String[] args) {
//        ���������
        int[] num = {3, 1, 2, 10, 1};
//        ��������
        int[] result = runningSum(num);
    }
    
    //    ��������ʹ�õ�ʱ����Ҫȥ��static
    public static int[] runningSum(int[] nums) {
//        �������ص����飬������ԭ����һ��
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
