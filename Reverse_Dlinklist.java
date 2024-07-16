/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LinkedList_package;

public class Reverse_Dlinklist {
    public static class Node{
        Node next;
        Node prev;
        int data;
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
    
    public void reverse()
    {
        Node curr=head;
        Node prev=null;
        Node next;
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            curr.prev=next;
            prev=curr;
            curr=next;
        }
        head=prev;
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
        head.prev=newnode;
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
        Reverse_Dlinklist r=new Reverse_Dlinklist();
        r.addfirst(5);
        r.addfirst(4);
        r.addfirst(3);
        r.addfirst(2);
        r.addfirst(1);
        r.print();
        r.reverse();
        r.print();
        System.out.println("size of linklist is:"+r.size);
    }
    
}
