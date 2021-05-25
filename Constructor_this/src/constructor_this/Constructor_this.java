/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructor_this;

/**
 *
 * @author surya
 */
public class Constructor_this {

   int id=100;
   public void add(int i,int j)
   {
       this.add(3,1);
       System.out.println("added"+this.id);
   }
   public void sub(int i,int j)
   {
       System.out.println("reduce");
   }
   public Constructor_this()
           {
               System.out.println("hi");
           }
   public Constructor_this(int i)
   {
       System.out.println("hello");
   }
    public static void main(String[] args) {
      Constructor_this obj=new Constructor_this();
      obj.add(2,3);
      obj.sub(2,3);
    }
    
}
