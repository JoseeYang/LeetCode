package com.leetcode.a2;

public class Solution02 {
    /*
    * ��Solution01�Ļ������Ż���ͷ�ڵ�ļ��룺
    * ��ԭ�����У���ͨ���ȶ���һ��ͷ�ڵ㣬Ȼ���ڱ���ʣ�µ�����
    * �ڸĽ������У����ȶ���һ��preָ�룬preָ��ָ���next���Ƿ��������ͷ�ڵ�
    * �Ľ�����ͬʱ�Ż��˽�λ��ʶ����д��
    * ���շ���pre.next����
    * ִ����ʱ��1 ms, ������ Java �ύ�л�����100.00%���û�
    * �ڴ����ģ�41.9 MB, ������ Java �ύ�л�����5.03%���û�  */
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
//        ��ʼ������ָ��pre����nextָ������ͷ
        ListNode pre = new ListNode();
//        ����������ĳ�������Ϊһ��
        sameLength(l1, l2);

//        s3���ܶ���Ҫ�ø���ָ��
        ListNode indexL3 = pre;


//        �����������Ϊ�յ�ʱ�����ѭ��
        while (l1 != null && l2 != null) {
            ListNode tempNode = new ListNode();
            tempNode.val = (l1.val + l2.val + CF) % 10;

//            ���ý�λ��ʶ��
            CF = (l1.val + l2.val + CF) / 10;
            
            indexL3.next = tempNode;
            l1 = l1.next;
            l2 = l2.next;
            indexL3 = indexL3.next;
        }

//        ������λ�н�λ�����ټ�һ���ڵ�
        if (CF == 1) {
            indexL3.next = new ListNode(1, null);
        }

//        ����ϵ㴦
//        ���ص���pre��nextָ��
        return pre.next;
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
