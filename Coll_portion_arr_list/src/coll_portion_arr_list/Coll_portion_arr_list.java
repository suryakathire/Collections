/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coll_portion_arr_list;

/**
 *
 * @author surya
 */
import java.util.*;
public class Coll_portion_arr_list {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      ArrayList <String> sub=new ArrayList<>();
    
      sub.add("kathiresan");
      sub.add("maheswari");
      sub.add("aravindhan");
      sub.add("balaji");
      sub.add("surya");
        System.out.println("original array list is:"+sub);
         
        System.out.println("Sublist is:"+sub.subList(2,5));
    }
    
}
