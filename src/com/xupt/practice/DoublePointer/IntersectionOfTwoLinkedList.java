package com.xupt.practice.DoublePointer;
/*编写一个程序，找到两个单链表相交的起始节点*/
public class IntersectionOfTwoLinkedList {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null||headB==null){
            return null;
        }
        ListNode pointerA=headA;
        ListNode pointerB=headB;
        while(pointerA!=pointerB){
            pointerA=pointerA==null?headB:pointerA.next;
            pointerB=pointerB==null?headA:pointerB.next;
        }
        return pointerA;
    }
}
