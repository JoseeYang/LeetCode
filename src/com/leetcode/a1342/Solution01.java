package com.leetcode.a1342;

public class Solution01 {
    /* ����˼·��
     * ������˼�룬��sum�����жϣ��ֱ���������ż���Ķ�Ӧ������ֱ��sum=0
     *
     * ִ����ʱ��0ms
     * �ڴ����ģ�38.2MB */
    public static void main(String[] args) {
//        ���������
        int num = 123;
        
        numberOfSteps(num);
    }
    
    //    ��������
    public static int numberOfSteps(int num) {
        int result = 0;

//        ����ѭ����ֱ��munΪ0
        while (num != 0) {
//            ż���ͳ��Զ�����������1
            if (num % 2 == 0) {
                num = num / 2;
            } else {
                num = num - 1;
            }
            result++;
        }
//        ���Զϵ㴦
        return result;
    }
}
