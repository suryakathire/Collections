/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception_ar;

/**
 *
 * @author surya
 */
public class Day1 {

     
    public static void main(String[] args) {
        int i= 10,j=0;
         //int k =i/j;
        try
        {
            int k =i/j;
            System.out.println(k);
        }
        catch(Exception ae)
        {
            System.out.println("enter"+ae);
        }
         finally
        {
            System.out.println("hello");
        }
        System.out.println("hi");
        System.out.println("hi");
        System.out.println("hi");System.out.println("hi");System.out.println("hi");System.out.println("hi");
        
        
        
        
    }
    
}
