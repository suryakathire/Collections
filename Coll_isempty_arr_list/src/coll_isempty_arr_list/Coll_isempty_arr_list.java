/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coll_isempty_arr_list;

/**
 *
 * @author surya
 */
import java.util.*;
public class Coll_isempty_arr_list {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList <Integer> em=new ArrayList<>();
        //System.out.println(""+em.isEmpty()); ;
        em.add(10);
        em.add(20);
        em.add(30);
       // System.out.println(""+em.isEmpty());
        if(em.isEmpty())
        {
            System.out.println("array is empty"+em);
            
        }
        else
        {
            System.out.println("array is not empty"+em);
        }
    }
    
}
