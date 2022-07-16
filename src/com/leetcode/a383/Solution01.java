package com.leetcode.a383;

public class Solution01 {
    /* 解题思路：
     *创建两个StringBuilder对象
     * 对第一个对象进行遍历，取出每一个字符，在第二个对象中寻找，如果找不到返回false
     * 全部遍历完返回ture
     *
     * 执行用时：3ms
     * 内存消耗：41.9MB  */
    
    public static void main(String[] args) {
//        程序的输入
        String ransomNote = "aa";
        String magazine = "aab";
//        程序的输出
        boolean tORf = canConstruct(ransomNote, magazine);
        
        System.out.println(tORf);
    }
    
    
    public static boolean canConstruct(String ransomNote, String magazine) {
        StringBuilder sb1 = new StringBuilder(ransomNote);
        StringBuilder sb2 = new StringBuilder(magazine);
        
        for (int i = 0; i < sb1.length(); i++) {
            int index = whereExist(sb1.charAt(i) + "", sb2);
//            如果不存在与第二个对象中，则返回false
            if (index == -1) {
                return false;
//            如果存在就在第二个对象中删除这个字符
            } else {
                sb2.deleteCharAt(index);
            }
        }
        return true;
    }
    
//    返回字符串在StringBuilder对象中的所引，不存在返回-1
    public static int whereExist(String ch, StringBuilder sb) {
        return sb.indexOf(ch);
    }
}
