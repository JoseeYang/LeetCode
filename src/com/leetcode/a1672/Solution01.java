package com.leetcode.a1672;

public class Solution01 {
    /* ����˼·��
     * ˫��forѭ��
     * ��һ���������ĳ��ȣ��ڶ�����������ά�ĳ���
     * �Ѷ�ά��������Ӻͷ���ֵ��ȣ��ѽϴ�ֵ���ظ�����ֵ
     * ִ����ʱ��0ms
     * �ڴ����ģ�40.6MB */
    
    public static void main(String[] args) {
//        ���������
        int[][] accounts = {{1, 5}, {7, 3}, {3, 5}};
        
        maximumWealth(accounts);
    }
    
    public static int maximumWealth(int[][] accounts) {
        int result = 0;
        int temp = 0;
        
        for (int i = 0; i < accounts.length; i++) {
//            �Ѷ�ά�ļ�����
            for (int j = 0; j < accounts[i].length; j++) {
                temp = temp + accounts[i][j];
            }
//            ������ν���ϴ󣬾Ͱѷ���ֵ�޸�Ϊ���ν��
            if (temp > result) {
                result = temp;
            }
            temp = 0;
        }

//        ���Զϵ㴦
        return result;
    }
}
