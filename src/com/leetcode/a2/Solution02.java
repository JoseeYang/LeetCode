package com.leetcode.a2;

public class Solution02 {
    /*
    * 在Solution01的基础上优化了头节点的加入：
    * 在原方法中，是通过先定义一个头节点，然后在遍历剩下的内容
    * 在改进方法中，事先定义一个pre指针，pre指针指向的next才是返回链表的头节点
    * 改进方法同时优化了进位标识符的写入
    * 最终返回pre.next即可
    * 执行用时：1 ms, 在所有 Java 提交中击败了100.00%的用户
    * 内存消耗：41.9 MB, 在所有 Java 提交中击败了5.03%的用户  */
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
//        初始化返回指针pre，其next指向链表头
        ListNode pre = new ListNode();
//        把两个链表的长度设置为一致
        sameLength(l1, l2);

//        s3不能动，要用辅助指针
        ListNode indexL3 = pre;


//        当两个链表均为空的时候结束循环
        while (l1 != null && l2 != null) {
            ListNode tempNode = new ListNode();
            tempNode.val = (l1.val + l2.val + CF) % 10;

//            设置进位标识符
            CF = (l1.val + l2.val + CF) / 10;
            
            indexL3.next = tempNode;
            l1 = l1.next;
            l2 = l2.next;
            indexL3 = indexL3.next;
        }

//        如果最高位有进位，则再加一个节点
        if (CF == 1) {
            indexL3.next = new ListNode(1, null);
        }

//        程序断点处
//        返回的是pre的next指向
        return pre.next;
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
