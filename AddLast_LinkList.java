/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//...................PROGRAM TO ADD or INSERT NODE AT LAST IN LINKEDLIST.....................

package LinkedList_package;

public class AddLast_LinkList {
    class Node{
        int data;
        Node next;
        public Node(int data){
         this.data=data;
         this.next=null;
    }
    }
    public static Node head;
    public static Node tail;
    public void addlast(int data)
    {
        //create node
        Node newnode=new Node(data);
        if(head==null)
        {
            head=tail=newnode;
            return;
        }
        //step 2
        tail.next=newnode;
        tail=newnode;
        
    }
    public void printt()
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
        AddLast_LinkList lt=new AddLast_LinkList();
        lt.addlast(3);
        lt.addlast(4);
        lt.addlast(5);
        lt.printt();
    }
    
}
