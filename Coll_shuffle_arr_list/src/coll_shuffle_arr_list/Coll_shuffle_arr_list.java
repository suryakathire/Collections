/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coll_shuffle_arr_list;
import java.util.*;
public class Coll_shuffle_arr_list {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList <String> shuf=new ArrayList<>();
        shuf.add("kathiresan");
        shuf.add("maheswari");
        shuf.add("aravindhan");
        shuf.add("balaji");
        shuf.add("surya");
        System.out.println("original array list is:"+shuf);
        Collections.shuffle(shuf);
        System.out.println("shuffled array list is"+shuf);
    }
    
}
