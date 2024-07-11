/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//...................Program to remove or delete node at first.....................
package LinkedList_package;

public class Remove_First {
    class Node{
        int data;
        Node next;
        public Node(int data)
        {
            this.data=data;
            this.next=next;
        }
        
    }
    // 1->2->3->4->5
    public static Node head;
    public static Node tail;
    public static int size;
     public void addFirst(int data)
        {
            //create a newnode
            Node newnode=new Node(data);
            size++;
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
                System.out.println("list is empty");
            }
            Node temp=head;
            while(temp!=null)
            {
                System.out.print(temp.data+"->");
                temp=temp.next;
                
            }
            System.out.println("null");
        }
        
        //REMOVE FIRST NODE IN LINKEDLIST
    public int removeFirst()
    {
        if(size==0)
        {
            System.out.println("linklist is empty");
            return Integer.MIN_VALUE;
        }
        if(size==1)
        {
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
            
        }
        int val=head.data;
        head=head.next;
        size--;
        return val;
        
    }
    public static void main(String[]args)
    {
        
        Remove_First f=new Remove_First();
        f.addFirst(5);
        f.addFirst(4);
        f.addFirst(3);
        f.addFirst(2);
        f.addFirst(1);
        f.print();
        System.out.println(f.size);
        f.removeFirst();
        f.print();
        System.out.println(f.size);
    }
}
