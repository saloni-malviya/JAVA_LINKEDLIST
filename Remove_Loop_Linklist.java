/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//..........PROGRAM TO REMOVE LOOP OR CYCLE IN A LINKEDLIST........................
package LinkedList_package;

public class Remove_Loop_Linklist {
    public static class Node{
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
    
    public static void removeCycle()
    {
        Node fast=head;
        Node slow=head;
        boolean cycle=false;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
            {
                cycle=true;
                break;
            }
        }
        if(cycle==false)
        {
            return;
        }
        
        slow=head;
        Node prev=null;
        while(slow!=fast)
        {
            prev=fast;
            slow=slow.next;
            fast=fast.next;
        }
        prev.next=null;
    }
    
    public static boolean cycle()
    {
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
            {
                return true;
            }
            
        }
        return false;
    }   
    public static void main(String[]args)
    {
        head=new Node(1);
        Node temp=new Node(2);
        head.next=temp;
        head.next.next=new Node(3);
        head.next.next.next=temp;
        System.out.println(cycle());
        removeCycle();
        System.out.println(cycle());
    }
}
