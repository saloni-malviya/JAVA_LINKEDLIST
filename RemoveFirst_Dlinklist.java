/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

//.........PROGRAM TO REMOVE NODE AT FIRST POSITION USING DOUBLYLINKLIST................
package LinkedList_package;

public class RemoveFirst_Dlinklist {
    public static class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data)
        {
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    
    public int removefirst()
    {
        if(head==null)
        {
            System.out.println("doubly linkedlist is empty");
            return Integer.MIN_VALUE;
        }
        if(size==1)
        {
            int val=head.data;
            head=tail=null;
            size--;
            return val;
        }
        int val=head.data;
        head=head.next;
        head.prev=null;
        size--;
        return val;
    }
    
    public void addfirst(int data)
    {
        Node newnode=new Node(data);
        size++;
        if(head==null)
        {
            head=tail=newnode;
            return;
        }
        newnode.next=head;
        head.prev=null;
        head=newnode;
    }
    
    public void print()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+"<->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[]args)
    {
        RemoveFirst_Dlinklist dll=new RemoveFirst_Dlinklist();
        dll.addfirst(4);
        dll.addfirst(3);
        dll.addfirst(2);
        dll.addfirst(1);
        dll.print();
        System.out.println("The size of linkedlist is:"+dll.size);
        dll.removefirst();
        dll.print();
        System.out.println("After removing first node, the size of linklist is:"+dll.size);
    }
    
}
