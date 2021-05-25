/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coll_reverse_arr_list;

/**
 *
 * @author surya
 */
import java.util.*;
public class Coll_reverse_arr_list {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ArrayList <String> rev=new ArrayList<>();
       rev.add("kathiresan");
               rev.add("maheswari");
               rev.add("aravindhan");
               rev.add("balaji");
               rev.add("surya");
               System.out.println("the original Array list is:"+rev);
               Collections.sort(rev);
               System.out.println("the accending order is:"+rev);
               Collections.reverse(rev);
               System.out.println("the reverse array list is:"+rev);
              
       
    }
    
}
