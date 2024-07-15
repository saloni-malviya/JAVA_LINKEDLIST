/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//.........PROGRAM TO REMOVE LAST NODE IN DOUBLY LINKEDLIST................
package LinkedList_package;

public class RemoveLast_Dlinklist {
    public static class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
        this.data=data;
        this.next=null;
        this.prev=null;
    }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    
    public int removelast()
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
        Node prev=head;
        for(int i=0;i<size-2;i++)
        {
        prev=prev.next;
        }
        int val=tail.data;
        prev.next=null;
        tail=prev;
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
        RemoveLast_Dlinklist dl=new RemoveLast_Dlinklist();
        dl.addfirst(5);
        dl.addfirst(4);
        dl.addfirst(3);
        dl.addfirst(2);
        dl.addfirst(1);
        dl.print();
        System.out.println(dl.size);
        dl.removelast();
        dl.print();
        System.out.println(dl.size);
    }
    
}
