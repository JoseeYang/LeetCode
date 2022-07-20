package com.leetcode.a876;

/* 解题思路：
 * 先获取到链表的个数，然后判断奇偶，得到需要从哪里开始截取链表，最后截取链表头到指定位置即可
 * 执行用时：0ms
 * 内存消耗：38.8MB */
public class Solution01 {
    public static void main(String[] args) {
        ListNode listNode6 = new ListNode(6);
        ListNode listNode5 = new ListNode(5, listNode6);
        ListNode listNode4 = new ListNode(4, listNode5);
        ListNode listNode3 = new ListNode(3, listNode4);
        ListNode listNode2 = new ListNode(2, listNode3);
        ListNode listNode1 = new ListNode(1, listNode2);
        
        middleNode(listNode1);
    }
    
    
    //    程序的主方法
    public static ListNode middleNode(ListNode head) {
//        确定从几个节点开始
        int index;
        if (countNode(head) % 2 == 0) {
            index = countNode(head) / 2;
        } else {
            index = (countNode(head) - 1) / 2;
        }
        for (int i = 0; i < index; i++) {
            head = head.next;
        }
        return head;
    }
    
    //    程序的主方法
    //    返回该链表的节点个数
    public static int countNode(ListNode head) {
        int count = 1;
        ListNode temp = head;
        
        while (temp.next != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
}
