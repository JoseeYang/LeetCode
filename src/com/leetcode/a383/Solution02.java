package com.leetcode.a383;

public class Solution02 {
    /* 该方法来自力扣
     * 思路分析：
     * 可以采用哈希解法，用空间换取时间的策略
     * 创建一个数组，长度为26（只出现小写字母），记录每个字母的出现频率
     * 然后再去验证这个数组是否包含了ransomNote 所需要的字母
     * 返回值即可
     * 执行用时：1ms
     * 内存消耗：41.5MB */
    
    
    public static void main(String[] args) {
//        程序的输入
        String ransomNote = "aa";
        String magazine = "ab";
//        程序的输出
        boolean tORf = canConstruct(ransomNote, magazine);
        
        System.out.println(tORf);
    }
    
    public static boolean canConstruct(String ransomNote, String magazine) {
        int[] arr = new int[26];
        int temp;
        
        for (int i = 0; i < magazine.length(); i++) {
            temp = magazine.charAt(i) - 'a';
            arr[temp]++;
        }
        
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
