/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//...................PROGRAM TO INSERT or ADD NODE AT FIRST IN LINKEDLIST.....................

package LinkedList_package;

public class AddFirst_LinkList {
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
           AddFirst_LinkList l=new AddFirst_LinkList();
           l.addFirst(3);
           l.addFirst(2);
           l.addFirst(1);
           l.print();
       }
    
    
}
