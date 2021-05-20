/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author UR
 */
// leet code problem 
// please reverse 1,2,3,4,5 to output 
import java.util.*;
public class ReverseLinkedList {
    public static void main (String[] args)
    {
       LinkedList linkList = new LinkedList();
       linkList.add(1);
       linkList.add(2);
       linkList.add(3);
       linkList.add(4);
       linkList.add(5);
       
       StringBuffer buffer = new StringBuffer();
       buffer.append(linkList);
       buffer.reverse();
       
       System.out.println("reversed linkedList" + buffer);
       
    }
}
