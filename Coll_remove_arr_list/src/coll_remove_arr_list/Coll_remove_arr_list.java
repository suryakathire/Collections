/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coll_remove_arr_list;
 import java.util.*;
public class Coll_remove_arr_list {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList <Integer> remov=new ArrayList<>();
        remov.add(10);
        remov.add(20);
        remov.add(30);
        remov.add(40);
        System.out.println(remov);
        remov.remove(0);
        System.out.println(remov);
    }
    
}
