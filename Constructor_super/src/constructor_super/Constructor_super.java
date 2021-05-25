/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructor_super;

/**
 *
 * @author surya
 */
public class Constructor_super {

     class Constructor_super
     {
         int id=100;
         public void add(int i,int j)
         {
             System.out.println("added");
         }
         public void sub(int i, int j)
         {
             System.out.println("reduce");
         }
         public Constructor_super()
         {
             
             System.out.println("hi");
         }
         public Constructor_super(int i)
         {
             System.out.println("hello");
         }
        class hi extends Constructor_super
         {
             public hi()
             {
                 System.out.println("java");
             }
             public hi(float j)
             {
                 super(3);
                 super.add(4,5);
                 System.out.println("opps"+super.id);
             }
    
    public static void main(String[] args) {
         hi obj1=new hi(3.2f);
         
    }
    
}
     }
     }