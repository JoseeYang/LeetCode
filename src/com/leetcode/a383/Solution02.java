package com.leetcode.a383;

public class Solution02 {
    /* �÷�����������
     * ˼·������
     * ���Բ��ù�ϣ�ⷨ���ÿռ任ȡʱ��Ĳ���
     * ����һ�����飬����Ϊ26��ֻ����Сд��ĸ������¼ÿ����ĸ�ĳ���Ƶ��
     * Ȼ����ȥ��֤��������Ƿ������ransomNote ����Ҫ����ĸ
     * ����ֵ����
     * ִ����ʱ��1ms
     * �ڴ����ģ�41.5MB */
    
    
    public static void main(String[] args) {
//        ���������
        String ransomNote = "aa";
        String magazine = "ab";
//        ��������
        boolean tORf = canConstruct(ransomNote, magazine);
        
        System.out.println(tORf);
    }
    
    public static boolean canConstruct(String ransomNote, String magazine) {
        int[] arr = new int[26];
        int temp;
        
//        �����ַ�������¼ÿ���ַ����ֵ�Ƶ�ʴ���������
        for (int i = 0; i < magazine.length(); i++) {
            temp = magazine.charAt(i) - 'a';
            arr[temp]++;
        }
        
//        �����ַ������������ж�Ӧ�ط��Ƿ����㣬�����㷵��False��ȫ�����㷵��Ture
        for (int i = 0; i < ransomNote.length(); i++) {
            temp = ransomNote.charAt(i) - 'a';
            if (arr[temp] > 0) {
                arr[temp]--;
            } else {
                return false;
            }
        }
        return true;
    }
}
