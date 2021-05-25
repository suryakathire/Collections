/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coll_sizearr_arr_list;

 
import java.util.*;
public class Coll_sizearr_arr_list {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList <String> s = new ArrayList <> ();
        s.add("surya");
        s.add("balaji");
        s.add("aravindhan");
        s.add("kathiresan");
        s.add("maheswari");
        
        System.out.println("Original array listis: " +s);
         System.out.println("Print using index of an element: ");
        int element = s.size();
         for (int i = 0; i <element; i++)
         {
            System.out.println(s.get(i));
         }
 }
}
    
    
}
