package com.leetcode.a383;

public class Solution01 {
    /* ����˼·��
     *��������StringBuilder����
     * �Ե�һ��������б�����ȡ��ÿһ���ַ����ڵڶ���������Ѱ�ң�����Ҳ�������false
     * ȫ�������귵��ture
     *
     * ִ����ʱ��3ms
     * �ڴ����ģ�41.9MB  */
    
    public static void main(String[] args) {
//        ���������
        String ransomNote = "aa";
        String magazine = "aab";
//        ��������
        boolean tORf = canConstruct(ransomNote, magazine);
        
        System.out.println(tORf);
    }
    
    
    public static boolean canConstruct(String ransomNote, String magazine) {
        StringBuilder sb1 = new StringBuilder(ransomNote);
        StringBuilder sb2 = new StringBuilder(magazine);
        
        for (int i = 0; i < sb1.length(); i++) {
            int index = whereExist(sb1.charAt(i) + "", sb2);
//            �����������ڶ��������У��򷵻�false
            if (index == -1) {
                return false;
//            ������ھ��ڵڶ���������ɾ������ַ�
            } else {
                sb2.deleteCharAt(index);
            }
        }
        return true;
    }
    
//    �����ַ�����StringBuilder�����е������������ڷ���-1
    public static int whereExist(String ch, StringBuilder sb) {
        return sb.indexOf(ch);
    }
}
