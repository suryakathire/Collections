/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coll_search_arr_list;
import java.util.*;
public class Coll_search_arr_list {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         ArrayList <Integer> ser=new ArrayList<>();
         
         ser.add(10);
         ser.add(20);
         ser.add(30);
         ser.add(40);
         ser.add(50);
         int index= ser.indexOf(20);
         int index1=ser.indexOf(100);
         if(index==-1)
         {
             System.out.println("The element 10 is not in the ArrayList");
         }
         else
         {
             System.out.println("The element 10 is in the ArrayList at index " + index);
         }
         if(index1==-1)
         {
             System.out.println("The element 100 is not in the ArrayList");
         }
         else
         {
             System.out.println("The element 100 is in the ArrayList at index " + index1);
         }
          
         
    }
    
}
