/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//SEARCH FOR A KEY IN A LINKEDLIST. RETURN THE POSITION(INDEX) WHERE IT IS FOUND.IF NOT FOUND,RETURN -1
package LinkedList_package;

public class Iterative_Search_In_Linkedlist {
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
       
    //SEARCHING KEY
    public int Search(int key)
    {
        Node temp=head;
        int i=0;
        while(temp!=null)
        {
            if(temp.data==key)
            {
                System.out.print("key found at index:");
                return i;
            }
            temp=temp.next;
            i++;
        }
        System.out.println("key does not found");
        return -1;
    }
    public static void main(String[]args)
    {
        Iterative_Search_In_Linkedlist s=new Iterative_Search_In_Linkedlist();
        s.addFirst(5);
        s.addFirst(4);
        s.addFirst(3);
        s.addFirst(2);
        s.print();
       System.out.println(s.Search(10));
       System.out.println(s.Search(5));
    }
}
