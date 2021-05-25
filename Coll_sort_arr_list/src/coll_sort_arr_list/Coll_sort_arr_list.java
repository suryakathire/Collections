/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coll_sort_arr_list;

import java.util.*;
public class Coll_sort_arr_list {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List <Integer> so=new ArrayList<>();
        so.add(10);
        so.add(20);
        so.add(70);
        so.add(30);
        so.add(89);
        so.add(100);
        System.out.println("original array list is:"+so);
        Collections.sort(so);
        System.out.println("sort value is:"+so); 
        
    }
    
}
