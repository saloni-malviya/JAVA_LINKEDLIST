/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//.............PROGRAM FOR MERGE SORT IN LINKEDLIST.....................................
package LinkedList_package;

public class Merge_sort_Linklist {
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
    
    //find mid
    private Node getmid(Node head)
    {
        Node slow=head;
        Node fast=head.next;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    
    //merge(left+right)
    private Node merge(Node head1,Node head2)
    {
        Node mergeLL=new Node(-1);
        Node temp=mergeLL;
        while(head1!=null && head2!=null)
        {
            if(head1.data<=head2.data)
            {
                temp.next=head1;
                head1=head1.next;
                temp=temp.next;
            }
            else
            {
                temp.next=head2;
                head2=head2.next;
                temp=temp.next;
            }
          
        }
        while(head1!=null)
        {
             temp.next=head1;
                head1=head1.next;
                temp=temp.next;
        }
        while(head2!=null)
        {
             temp.next=head2;
                head2=head2.next;
                temp=temp.next;
        }
          return mergeLL.next;
    }
    
    //code
    public Node mergeSort(Node head)
    {
        if(head==null || head.next==null)
        {
            return head;
        }
        
        //find mid
        Node mid=getmid(head);
        
        //left and right MS
        Node righthead=mid.next;
        mid.next=null;
        Node newleft=mergeSort(head);
        Node newright=mergeSort(righthead);
        
        //merge
        return merge(newleft,newright);
    }
    
    public void addfirst(int data)
    {
        Node newnode=new Node(data);
        if(head==null)
        {
            head=tail=newnode;
            return;
        }
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
        Merge_sort_Linklist ll=new Merge_sort_Linklist();
        ll.addfirst(1);
        ll.addfirst(2);
        ll.addfirst(3);
        ll.addfirst(4);
        ll.addfirst(5);
        ll.print();
        ll.head=ll.mergeSort(ll.head);
        ll.print();
    }
    
}
