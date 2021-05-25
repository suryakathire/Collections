/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coll_replace_sepci_arr_list;

/**
 *
 * @author surya
 */
import java.util.*;
public class Coll_replace_sepci_arr_list {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> er=new ArrayList<>();
        er.add("yellow");
        er.add("green");
        System.out.println("the original array list is:"+er);
        String color="red";
        er.set(1,color);
        int num =er.size();
        System.out.println("repalce with 2 nd element in 'red':");
        for(int i=0;i<num;i++)
        {
            System.out.println(er.get(i));
        }
        
        
        
    }
    
}
