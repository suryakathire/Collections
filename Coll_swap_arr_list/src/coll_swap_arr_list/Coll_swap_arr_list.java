/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coll_swap_arr_list;

 import java.util.*;
public class Coll_swap_arr_list {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         ArrayList <String>sw=new ArrayList<>();
         sw.add("surya");
         sw.add("kishorkumar");
         sw.add("tamil");
         sw.add("valli");
         sw.add("preetha");
         sw.add("neranjan");
         sw.add("shyam");
         System.out.println("original array list is:"+sw);
         Collections.swap(sw, 0, 1);
         System.out.println("swap array list is:"+sw);
    }
    
}
