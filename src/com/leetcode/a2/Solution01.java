package com.leetcode.a2;


public class Solution01 {
    /* 解题思路：
     * 为了计算方便，开始之前先把两个链表修改为同样长度，较短的那个补零
     * 遍历两个链表，每次取出同一单位的数相加，并将其结果存入返回链表的同一单位，进位标识符保存进位信息
     * 往后遍历列表，如果一个链表为空，就往后加入一个值为0的节点，继续遍历
     * 直到两个列表均为空，查看进位标识符，如果是1，就再第三个列表再加一个值为1的节点（最高位的进位）
     * 输出第三个链表
     * 执行用时：1 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：41.3 MB, 在所有 Java 提交中击败了67.54%的用户  */
    public static void main(String[] args) {
//        创建链表l1和l2
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
    
    
    //    程序的主方法
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//        初始化进位标识符
        int CF = 0;
//        初始化返回链表头
        ListNode l3 = new ListNode();
//        把两个链表的长度设置为一致
        sameLength(l1, l2);
        
//        给返回链表头和进位标识符赋值
        if (l1.val + l2.val >= 10) {
            CF = 1;
        }
        l3.val = (l1.val + l2.val) % 10;

//        s3不能动，要用辅助指针
        ListNode indexL3 = l3;
        
        
//        当两个链表均为空的时候结束循环
        while (l1.next != null && l2.next != null) {
            ListNode tempNode = new ListNode();
            tempNode.val = (l1.next.val + l2.next.val + CF) % 10;

//            设置进位标识符
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

//        如果最高位有进位，则再加一个节点
        if (CF == 1) {
            ListNode tempNode = new ListNode(1, null);
            indexL3.next = tempNode;
        }
        
//        程序断点处
        return l3;
    }
    
    
    //    把两个链表的长度跟改为一致（尾部加零节点）
    public static void sameLength(ListNode l1, ListNode l2) {
        ListNode list1 = l1;
        ListNode list2 = l2;
//        两个链表的next至少有一个不为空则一直补0
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
