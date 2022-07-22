package com.leetcode.a2;


public class Solution01 {
    /* ����˼·��
     * Ϊ�˼��㷽�㣬��ʼ֮ǰ�Ȱ����������޸�Ϊͬ�����ȣ��϶̵��Ǹ�����
     * ������������ÿ��ȡ��ͬһ��λ������ӣ������������뷵�������ͬһ��λ����λ��ʶ�������λ��Ϣ
     * ��������б����һ������Ϊ�գ����������һ��ֵΪ0�Ľڵ㣬��������
     * ֱ�������б��Ϊ�գ��鿴��λ��ʶ���������1�����ٵ������б��ټ�һ��ֵΪ1�Ľڵ㣨���λ�Ľ�λ��
     * �������������
     * ִ����ʱ��1 ms, ������ Java �ύ�л�����100.00%���û�
     * �ڴ����ģ�41.3 MB, ������ Java �ύ�л�����67.54%���û�  */
    public static void main(String[] args) {
//        ��������l1��l2
        ListNode node1_7 = new ListNode(9, null);
        ListNode node1_6 = new ListNode(9, node1_7);
        ListNode node1_5 = new ListNode(9, node1_6);
        ListNode node1_4 = new ListNode(9, node1_5);
        ListNode node1_3 = new ListNode(9, node1_4);
        ListNode node1_2 = new ListNode(9, node1_3);
        ListNode node1_1 = new ListNode(9, node1_2);
        
        
        ListNode node2_4 = new ListNode(9, null);
        ListNode node2_3 = new ListNode(9, node2_4);
        ListNode node2_2 = new ListNode(9, node2_3);
        ListNode node2_1 = new ListNode(9, node2_2);
        
        addTwoNumbers(node1_1, node2_1);
    }
    
    
    //    �����������
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//        ��ʼ����λ��ʶ��
        int CF = 0;
//        ��ʼ����������ͷ
        ListNode l3 = new ListNode();
//        ����������ĳ�������Ϊһ��
        sameLength(l1, l2);
        
//        ����������ͷ�ͽ�λ��ʶ����ֵ
        if (l1.val + l2.val >= 10) {
            CF = 1;
        }
        l3.val = (l1.val + l2.val) % 10;

//        s3���ܶ���Ҫ�ø���ָ��
        ListNode indexL3 = l3;
        
        
//        �����������Ϊ�յ�ʱ�����ѭ��
        while (l1.next != null && l2.next != null) {
            ListNode tempNode = new ListNode();
            tempNode.val = (l1.next.val + l2.next.val + CF) % 10;

//            ���ý�λ��ʶ��
            if ((l1.next.val + l2.next.val + CF) >= 10) {
                CF = 1;
            } else {
                CF = 0;
            }
            indexL3.next = tempNode;
            
            l1 = l1.next;
            l2 = l2.next;
            indexL3 = indexL3.next;
        }

//        ������λ�н�λ�����ټ�һ���ڵ�
        if (CF == 1) {
            ListNode tempNode = new ListNode(1, null);
            indexL3.next = tempNode;
        }
        
//        ����ϵ㴦
        return l3;
    }
    
    
    //    ����������ĳ��ȸ���Ϊһ�£�β������ڵ㣩
    public static void sameLength(ListNode l1, ListNode l2) {
        ListNode list1 = l1;
        ListNode list2 = l2;
//        ���������next������һ����Ϊ����һֱ��0
        while (!(list1.next == null && list2.next == null)) {
            if (list1.next == null) {
                list1.next = new ListNode(0);
            }
            if (list2.next==null) {
                list2.next = new ListNode(0);
            }
            list1 = list1.next;
            list2 = list2.next;
        }
    }
}
