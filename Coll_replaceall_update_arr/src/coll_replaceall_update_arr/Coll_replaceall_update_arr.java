/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coll_replaceall_update_arr;

 import java.util.*;

public class Coll_replaceall_update_arr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList <Integer> re=new ArrayList<>();
        ArrayList <Integer> a=new ArrayList<>();
        re.add(20);
        re.add(40);
        re.add(50);
        System.out.println(re);
        for(int i=0;i<re.size();i++)
        {
            if(re.get(i).equals(20))
            {
                re.set(i,200);
            }
        }
        System.out.println(re);
        
    }
    
}
