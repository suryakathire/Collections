/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coll_increase_capa_arr_list;

/**
 *
 * @author surya
 */
import java.util.*;
public class Coll_increase_capa_arr_list {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         ArrayList<String> in=new ArrayList<>(3);
         in.add("surya");
         in.add("balaji");
         in.add("aravindhan");
         System.out.println("the normal capacity of the arraylist is:"+in);
         in.ensureCapacity(5);
         in.add("arjun");
         in.add("balaji");
         System.out.println("the increase capacity of the array list is:"+in);
    }
    
}
