package com.xupt.practice.TypicalProblem;
/*
  移除链表元素
删除链表中等于给定值 val 的所有节点。

示例:

输入: 1->2->6->3->4->5->6, val = 6
输出: 1->2->3->4->5
 */
public class RemoveLinkdedListElements {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode node=dummy;
        while(node.next!=null){
            if(node.next.val==val){
                node.next=node.next.next;
            }else{
                node=node.next;
            }
        }
        return dummy.next;
    }
}
