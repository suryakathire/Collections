/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coll_trim_arr_list;

import java.util.ArrayList;

/**
 *
 * @author surya
 */
public class Coll_trim_arr_list {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ArrayList <Integer> re=new ArrayList<>();
        re.add(10);
        re.add(20);
        re.add(30);
        System.out.println("the original array size is:"+re);
        re.trimToSize();
        System.out.println("the trim to size is:"+re );
    }
    
}
