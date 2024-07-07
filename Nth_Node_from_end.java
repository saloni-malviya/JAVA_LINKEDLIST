/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//..........FIND AND REMOVE NTH NODE FROM END.........................
package LinkedList_package;

public class Nth_Node_from_end {
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
    
    public void delete(int n)
    {
        //calculate size
        int sz=0;
        Node temp=head;
        while(temp!=null)
        {
            temp=temp.next;
            sz++;
        }
        //calculate remove node from first
        if(n==sz)
        {
            head=head.next;
            return;
        }
        
        Node prev=head;
        int i=1;
        int find=sz-n;
        while(i<find)
        {
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return;
    }
    public static void main(String[]args)
    {
        Nth_Node_from_end n=new Nth_Node_from_end();
        n.addFirst(5);
        n.addFirst(4);
        n.addFirst(3);
        n.addFirst(2);
        n.addFirst(1);
        n.print();
        n.delete(2);
        n.print();
    }
    
}
