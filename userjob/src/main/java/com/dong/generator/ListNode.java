package com.dong.generator;

public class ListNode {
	
	private ListNode next=null;
	private int val;
	public ListNode getNext() {
		return next;
	}
	public void setNext(ListNode next) {
		this.next = next;
	}
	public int getVal() {
		return val;
	}
	public void setVal(int val) {
		this.val = val;
	}
   ListNode(int val){
	   this.val=val;
   }
   public static void main(String[] args) {
	ListNode node=new ListNode(1);
	ListNode scondNode=new ListNode(2);
	ListNode thirdNode=new ListNode(3);
	node.next=scondNode;
	scondNode.next=thirdNode;
	ListNode preNode=null;
	ListNode newHead=node;
	ListNode nextNode=null;
	while(newHead!=null) {
		ListNode newNext=newHead.next;
		if(newNext==null) {
			preNode=newHead;
		}
		newHead.next=nextNode;
		nextNode=newHead;
		newHead=newNext;
	}
	while(preNode!=null) {
		System.out.println(preNode.val);
		preNode=preNode.next;
	}
	
	
}
   
   public  static ListNode getListNode(ListNode head,int k) {
	   ListNode node=head;
       int count=0;
       while(node!=null){
           node=node.next;
             count++;
          
       }
       if(k>count)
           return null;
       int res=count-k+1;
       int counter=1;

       while(counter!=res){
           head=head.next;
         
           counter++;
       }
       return head;
   }
}
