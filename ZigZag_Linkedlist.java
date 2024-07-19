/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//............PROGRAM TO ZIGZAG LINKEDLIST.........................
//....FOR A LINKEDLIST THE FORM: L(1)->L(2)->L(3)->L(4).....L(n-1)->L(n)
//....CONVERT IT INTO ZIGZAG FORM i.e. L(1)->L(n)->L(2)->L(n-1)->L(3)->L(n-2).....

package LinkedList_package;

public class ZigZag_Linkedlist {
    public static class Node{
        Node next;
        int data;
        public Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public void zigzag()
    {
        //find mid
        Node slow=head;
        Node fast=head.next;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        Node mid=slow;
        
        //reverse
        Node curr=mid.next;
        mid.next=null;
        Node prev=null;
        Node next;
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node left=head;
        Node right=prev;
        Node nextL, nextR;
        
        //alternate merging
        while(left!=null && right!=null)
        {
            nextL=left.next;
            left.next=right;
            nextR=right.next;
            right.next=nextL;
            
            left=nextL;
            right=nextR;
        }
    }
    
    public void addlast(int data)
    {
        Node newnode=new Node(data);
        if(head==null)
        {
            head=tail=newnode;
            return;
        }
        tail.next=newnode;
        tail=newnode;
    }
    public void print()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[]args)
    {
        ZigZag_Linkedlist z=new ZigZag_Linkedlist();
        z.addlast(1);
        z.addlast(2);
        z.addlast(3);
        z.addlast(4);
        z.addlast(5);
        
        z.print();
        z.zigzag();
        z.print();
    }
    
}
