/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//...........PROGRAM TO DETECT LOOP/CYCLE IN A LINKEDLIST.............................
package LinkedList_package;

public class Loop_Detection_Linklist {
   public static class Node{
        Node next;
        int data;
        public Node(int data)
        {
            this.data=data;
          this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    
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
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=head;
        System.out.println(cycle());
    }
}
