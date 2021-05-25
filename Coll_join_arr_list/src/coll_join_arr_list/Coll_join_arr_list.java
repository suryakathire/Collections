/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coll_join_arr_list;

/**
 *
 * @author surya
 */
import java.util.*;
public class Coll_join_arr_list {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList <Integer> ad=new ArrayList<>();
         
        ad.add(10);
        ad.add(20);
        ad.add(30);
        System.out.println("arraylist 1 is:"+ad);
        ArrayList<Integer> a=new ArrayList<>();
        a.add(40);
        a.add(50);
        a.add(60);
        System.out.println("arraylist 2 is:"+a);
        
         ad.addAll(a);
        System.out.println("join array list is:"+ad);
        
        
    }
    
}
