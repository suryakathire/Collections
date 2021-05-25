/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coll_empty_arr_list;

/**
 *
 * @author surya
 */
import java.util.*;
public class Coll_empty_arr_list {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList <Integer> re=new ArrayList<>();
        re.add(10);
        re.add(20);
        re.add(30);
        System.out.println("the original arraylist is:"+re);
        re.removeAll(re);
        System.out.println("removed array list is:"+re);
    }
    
}
