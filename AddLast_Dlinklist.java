/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//...........PROGRAM TO INSERT NODE AT LAST POSITION IN DOUBLY LINKEDLIST....................
package LinkedList_package;

public class AddLast_Dlinklist {
    public static class Node{
        int data;
        Node prev;
        Node next;
        public Node(int data)
        {
            this.data=data;
            this.prev=null;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    
    public void addlast(int data)
    {
        Node newnode=new Node(data);
        size++;
        if(head==null)
        {
            head=tail=newnode;
            return;
        }
        tail.next=newnode;
        newnode.next=null;
        tail=newnode;
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
        AddLast_Dlinklist d=new AddLast_Dlinklist();
        d.addlast(5);
        d.addlast(4);
        d.addlast(3);
        d.addlast(2);
        d.addlast(1);
        d.print();
        System.out.println("the size of doubly linkedlist is:"+d.size);
    }
}
