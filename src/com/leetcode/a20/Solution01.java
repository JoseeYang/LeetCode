package com.leetcode.a20;

import java.util.Stack;

public class Solution01 {
    /* ����˼·��
     * ����ַ����ĳ���Ϊ����ֱ�ӷ���false
     * ��ջ��������⣬��ʼ��һ��ջ
     * ������������ţ�����"(","[","{" ,��ֱ��ѹ��ջ
     * ������������ţ�����")","]","}"�����ջΪ�գ��ͷ���false�������Ϊ�վͳ�ջһ������
     * �����ջ��������ź����������ƥ�䣬�ͼ����жϣ�ֱ���ַ���������ɣ����ջΪ�գ��򷵻�ture
     * �����ջ��������ź���������Ų�ƥ�䣬�ͷ���false
     * ִ����ʱ��1 ms, ������ Java �ύ�л�����98.93%���û�
     * �ڴ����ģ�39.3 MB, ������ Java �ύ�л�����66.74%���û� */
    
    public static void main(String[] args) {
//        ��ʼ���������
        String s = "{[]]}";
        
        System.out.println(isValid(s));
    }
    
    
    //    �����������
    public static boolean isValid(String s) {
//        ��Ϊ��ȷ��ƥ���ܱ�֤�ַ����ĳ���Ϊż��������һ�����Ƿ����ַ�������Ϊ������ֱ�ӷ���false
        if (s.length() % 2 == 1) {
            return false;
        }

//        ��ʼ���ַ�ջ
        Stack<Character> stack = new Stack<>();
//        ����һ��ָ�븨�������ַ���
        int point = 0;
//        ÿ�α����������ַ�������ch��
        char ch;
//        ���������ַ���
        while (point < s.length()) {
            ch = s.charAt(point);
            if (ch == '(' || ch == '[' || ch == '{') {
//                ���ch�������ţ���ֱ��ѹ��ջ
                stack.push(ch);
            } else {
//                ���������ţ�����")","]","}"���ͳ�ջһ������
//                �����ǰջΪ�գ���ֱ�ӷ���false
//                �����ջ��������ź���������Ų�ƥ�䣬�ͷ���false
                if (stack.empty() || ch != getLeftParenthesis(stack.pop())) {
                    return false;
                }
            }
//            ָ�����
            point++;
        }
//        �ַ���������ɣ��ж�ջ�Ƿ�Ϊ�գ����ջΪ����˵���������,����ture
//        �����Ϊ��˵��ջ�л���δƥ��������ţ�����false
        return stack.empty();
    }
    
    //    ����һ�����ŵ�����������������ŵ��Ұ��
    public static char getLeftParenthesis(char ch) {
        return switch (ch) {
            case '(' -> ')';
            case '[' -> ']';
            case '{' -> '}';
            default -> ' ';
        };
    }
}
