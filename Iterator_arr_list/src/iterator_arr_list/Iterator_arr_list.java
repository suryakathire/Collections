/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iterator_arr_list;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author surya
 */
public class Iterator_arr_list {

     
    public static void main(String[] args) 
    {
        ArrayList <String> color=new ArrayList<String>();
         color.add("yellow");
         color.add("red");
         color.add("green");
         color.add("blue");
         //System.out.println(color);
         Iterator a=color.iterator();
         while(a.hasNext())
             
         {
             System.out.println(a.next());
         }
        
        
        
    }
    
}
