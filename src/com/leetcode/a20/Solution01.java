package com.leetcode.a20;

import java.util.Stack;

public class Solution01 {
    /* 解题思路：
     * 如果字符串的长度为奇数直接返回false
     * 用栈解决该问题，初始化一个栈
     * 如果遇到左括号，包括"(","[","{" ,就直接压入栈
     * 如果遇到右括号，包括")","]","}"，如果栈为空，就返回false，如果不为空就出栈一个符号
     * 如果出栈的这个符号和这个右括号匹配，就继续判断，直到字符串遍历完成，如果栈为空，则返回ture
     * 如果出栈的这个符号和这个右括号不匹配，就返回false
     * 执行用时：1 ms, 在所有 Java 提交中击败了98.93%的用户
     * 内存消耗：39.3 MB, 在所有 Java 提交中击败了66.74%的用户 */
    
    public static void main(String[] args) {
//        初始化输入参数
        String s = "{[]]}";
        
        System.out.println(isValid(s));
    }
    
    
    //    程序的主方法
    public static boolean isValid(String s) {
//        因为正确的匹配能保证字符串的长度为偶数，所以一旦我们发现字符串长度为奇数，直接返回false
        if (s.length() % 2 == 1) {
            return false;
        }

//        初始化字符栈
        Stack<Character> stack = new Stack<>();
//        定义一个指针辅助遍历字符串
        int point = 0;
//        每次遍历出来的字符保存在ch中
        char ch;
//        遍历整个字符串
        while (point < s.length()) {
            ch = s.charAt(point);
            if (ch == '(' || ch == '[' || ch == '{') {
//                如果ch是左括号，就直接压入栈
                stack.push(ch);
            } else {
//                遇到右括号，包括")","]","}"，就出栈一个符号
//                如果当前栈为空，则直接返回false
//                如果出栈的这个符号和这个右括号不匹配，就返回false
                if (stack.empty() || ch != getLeftParenthesis(stack.pop())) {
                    return false;
                }
            }
//            指针后移
            point++;
        }
//        字符串遍历完成，判断栈是否为空，如果栈为空则说明遍历完成,返回ture
//        如果不为空说明栈中还有未匹配的左括号，返回false
        return stack.empty();
    }
    
    //    输入一个括号的左半个，返回这个括号的右半个
    public static char getLeftParenthesis(char ch) {
        return switch (ch) {
            case '(' -> ')';
            case '[' -> ']';
            case '{' -> '}';
            default -> ' ';
        };
    }
}
