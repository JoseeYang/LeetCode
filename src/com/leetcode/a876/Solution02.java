package com.leetcode.a876;

/* ����˼·��
 * ����ָ�뷨��
 * ������ָ�� slow �� fast һ���������slow һ����һ����fast һ������������ô�� fast ���������ĩβʱ��slow ��Ȼλ���м� */
public class Solution02 {
    public static void main(String[] args) {
        ListNode listNode6 = new ListNode(6);
        ListNode listNode5 = new ListNode(5, listNode6);
        ListNode listNode4 = new ListNode(4, listNode5);
        ListNode listNode3 = new ListNode(3, listNode4);
        ListNode listNode2 = new ListNode(2, listNode3);
        ListNode listNode1 = new ListNode(1, listNode2);
    
        middleNode(listNode1);
    }
    
//    �����������
    public static ListNode middleNode(ListNode head) {
//        ��������ָ��
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
