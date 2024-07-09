/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//...................PROGRAM TO PRINT THE LINKEDLIST.....................
package LinkedList_package;

public class Print_LinkList {
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
    public void addFirst(int data)
    {
        //create a node
        Node newnode=new Node(data);
        //steps
        if(head==null)
        {
            head=tail=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
    }
    public void addLast(int data)
    {
        //create node
        Node newnode=new Node(data);
        //steps
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
        if(head==null)
        {
            System.out.println("LinkList is empty");
            return;
        }
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
        Print_LinkList p=new Print_LinkList();
        p.print();
        p.addFirst(3);
        p.print();
        p.addFirst(2);
        p.print();
        p.addFirst(1);
        p.print();
        p.addLast(4);
        p.print();
        p.addLast(5);
        p.print();
    }
}
