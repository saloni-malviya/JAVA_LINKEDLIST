/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//...................PROGRAM TO ADD or INSERT NODE AT MIDDLE IN LINKEDLIST.....................

package LinkedList_package;

public class AddMiddle_Linkedlist {
    public class Node{
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
    
    //add node to the middle
    public void addmiddle(int idx,int data)
    {
        Node newnode=new Node(data);
        Node temp=head;
        int i=0;
        while(i<idx-1)
        {
            temp=temp.next;
            i++;
        }
        newnode.next=temp.next;
        temp.next=newnode;
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
    public static void main(String[]args)
    {
        AddMiddle_Linkedlist ls=new AddMiddle_Linkedlist();
        ls.addfirst(5);
        ls.addfirst(4);
        ls.addfirst(3);
        ls.addfirst(2);
        ls.addfirst(1);
        ls.print();
        ls.addmiddle(2, 9);
        //ls.addmiddle(4,8);
        ls.print();
    }
}
