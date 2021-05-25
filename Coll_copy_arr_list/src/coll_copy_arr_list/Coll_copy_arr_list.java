/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coll_copy_arr_list;

/**
 *
 * @author surya
 */
import java.util.*;
public class Coll_copy_arr_list {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ArrayList <Integer> cop =new ArrayList<>();
       ArrayList <Integer> a=new ArrayList<>();
       cop.add(10);
       cop.add(20);
       cop.add(30);
       cop.add(40);
        System.out.println("origginal array list is:"+cop);
        for(int i=0;i<cop.size();i++)
        {
            a=cop;
        }
        System.out.println("copying array list is:");
        //for(int j=0;j<a.size();j++)
        //{
            System.out.print(a);
       // }
        
       
    }
    
}
