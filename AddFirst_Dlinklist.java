/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//.......PROGRAM FOR INSERT NODE AT FIRST POSITION IN DOUBLY LINKEDLIST....................
package LinkedList_package;

public class AddFirst_Dlinklist {
    public static class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data)
        {
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    public void addfirst(int data)
    {
        Node newnode=new Node(data);
        size++;
        if(head==null)
        {
            head=tail=newnode;
            return;
        }
        newnode.next=head;
        head.prev=newnode;
        head=newnode;
    }
    public void print()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+"<->");
            temp=temp.next;
        }
        System.out.println("null");
        
    }
    public static void main(String[]args)
    {
        AddFirst_Dlinklist l=new AddFirst_Dlinklist();
        l.addfirst(4);
        l.addfirst(3);
        l.addfirst(2);
        l.addfirst(1);
        l.print();
        System.out.println(l.size);
    }
}
