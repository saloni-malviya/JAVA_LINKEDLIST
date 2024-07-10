/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//...........SEARCH FOR A KEY IN A LINKEDLIST. RETURN THE POSITION WHERE IT IS FOUND.
//...........IF NOT FOUND,RETURN -1, USE RECURSION
package LinkedList_package;

public class Recursive_Search {
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
    
    //RECURSIVE SEARCH
     public int recursivesearch(int key)
     {
         return helper(head,key);
     }
     public int helper(Node head, int key)
     {
         if(head==null)
         {
             return -1;
         }
         if(head.data==key)
         {
             return 0;
         }
         int idx=helper(head.next,key);
         if(idx==-1)
         {
             return -1;
             
         }
         return idx+1;
     }
     public static void main(String[]args)
     {
         Recursive_Search r=new Recursive_Search();
         r.addFirst(5);
         r.addFirst(4);
         r.addFirst(3);
         r.addFirst(2);
         r.addFirst(1);
         r.print();
         System.out.println(r.recursivesearch(5));
     }
}
