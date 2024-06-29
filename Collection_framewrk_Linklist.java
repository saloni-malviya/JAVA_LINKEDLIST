/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//.........PROGRAM TO INSERTION AND DELETION OF LINKLIST USING COLLECTION FRAMEWORK............
package LinkedList_package;
import java.util.*;

public class Collection_framewrk_Linklist {
    public static void main(String[]args)
    {
        //create
        LinkedList <Integer> ll=new LinkedList<>();
        //add last
        ll.addLast(1);
        ll.addLast(2);
        
        //add first
        ll.addFirst(0);
        System.out.println(ll);
        //remove
        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll);
        
    }
}
