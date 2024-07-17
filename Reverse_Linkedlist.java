/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//............JAVA PROGRAM TO REVERSE A LINKEDLIST(ITERATIVE APPROACH)
package LinkedList_package;

public class Reverse_Linkedlist {
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
            //create a newnode
            Node newnode=new Node(data);
            //condition
            if(head==null)
            {
                head=tail=newnode;
                return;
            }
            //step2
            newnode.next=head;
            head=newnode;
            
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
    
    //REVERSE LINKEDLIST
    public void reverse()
    {
        Node prev=null;
        Node curr=tail=head;
        Node next;
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }
    public static void main(String[]args)
    {
        Reverse_Linkedlist l=new Reverse_Linkedlist();
        l.addFirst(5);
        l.addFirst(4);
        l.addFirst(3);
        l.addFirst(2);
        l.addFirst(1);
        l.print();
        l.reverse();
        l.print();
    }
}
