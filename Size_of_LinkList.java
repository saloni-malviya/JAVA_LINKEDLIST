/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//...................PROGRAM TO FIND THE SIZE OF LINKEDLIST.....................

package LinkedList_package;

public class Size_of_LinkList {
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
        
        //add node in the first
        public void addFirst(int data)
        {
            //create a node
        Node newnode=new Node(data);
        //increse size
        size++;
        //steps
        if(head==null)
        {
            head=tail=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
               }
        
        //add node in the last
        public void addLast(int data)
        {
            //create node
        Node newnode=new Node(data);
        
        //increse size
        size++;
        //steps
        if(head==null)
        {
            head=tail=newnode;
            return;
        }
        tail.next=newnode;
        tail=newnode;
        }
        
        //print linkedlist
        public void printt()
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
        Size_of_LinkList l=new Size_of_LinkList();
        l.addFirst(3);
        l.addFirst(2);
        l.addFirst(1);
        l.addLast(4);
        l.addLast(5);
        l.printt();
       //print the size of linkedlist
        System.out.println(l.size);
    }
    
}
