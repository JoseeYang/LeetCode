package com.leetcode.a876;

/* ����˼·��
 * �Ȼ�ȡ������ĸ�����Ȼ���ж���ż���õ���Ҫ�����￪ʼ��ȡ��������ȡ����ͷ��ָ��λ�ü���
 * ִ����ʱ��0ms
 * �ڴ����ģ�38.8MB */
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
    
    
    //    �����������
    public static ListNode middleNode(ListNode head) {
//        ȷ���Ӽ����ڵ㿪ʼ
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
    
    //    �����������
    //    ���ظ�����Ľڵ����
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
