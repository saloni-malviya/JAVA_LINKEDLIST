/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//...................PROGRAM TO REMOVE or DELETE NODE AT LAST.....................
//REMOVE LAST NODE IN LINKEDLIST

package LinkedList_package;

public class Remove_last {
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
    
     public void addFirst(int data)
        {
            //create a newnode
            Node newnode=new Node(data);
            //condition
            size++;
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
            Node temp=head;
            while(temp!=null)
            {
                System.out.print(temp.data+"->");
                temp=temp.next;
                
            }
            System.out.println("null");
        }
        
        //REMOVE LAST NODE IN LINKEDLIST
        public int removelast()
        {
            if(size==0)
            {
                System.out.println("linkedlist is empty");
            }
            if(size==1)
            {
                int val=head.data;
                head=tail=null;
                size=0;
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
        public static void main(String[]args)
        {
            Remove_last r=new Remove_last();
            r.addFirst(5);
            r.addFirst(4);
            r.addFirst(3);
            r.addFirst(2);
            r.addFirst(1);
            r.print();
            System.out.println(r.size);
            r.removelast();
            r.print();
            System.out.println(r.size);
        }
    
}
