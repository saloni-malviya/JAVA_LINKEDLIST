/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//........PROGRAM TO CHECK IF LINKEDLIST IS PALINDROME OR NOT........................
package LinkedList_package;

public class Palindrome_LinkedList {
    class Node{
        int data;
        Node next;
        public Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    //Find Mid
    public Node findMid(Node head)
    {
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    //check palindrome
    public boolean checkPalindrome()
    {
        //base case
        if(head==null && head.next==null)
        {
            return true;
        }
        
        //step-1(find mid)
        Node midNode=findMid(head);
        
        //step-2(reverse 2nd half)
        Node prev=null;
        Node next;
        Node curr=midNode;
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node right=prev;
        Node left=head;
    
        //step-3(check lefthalf & righthalf)
        while(right!=null)
        {
            if(left.data != right.data)
            {
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
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
        Palindrome_LinkedList p=new Palindrome_LinkedList();
        p.addlast(1);
        p.addlast(2);
        p.addlast(2);
        p.addlast(1);
        p.print();
        System.out.println(p.checkPalindrome());
    }
}


