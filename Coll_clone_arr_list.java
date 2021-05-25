/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coll_clone_arr_list;

 import java.util.*;
public class Coll_clone_arr_list {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         ArrayList <String> cl=new ArrayList<>();
         cl.add("surya");
         cl.add("anand");
         cl.add("dharani");
         System.out.println("original Arraylist is:"+cl);
         System.out.println("clone array is:"+cl.clone());
    }
    
}
