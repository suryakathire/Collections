/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructor_default_para;

/**
 *
 * @author surya
 */
public class Constructor_default_para {

    String name;
    int id;
    public Constructor_default_para()
    {
        id=101;
        System.out.println(id);
    }
    public Constructor_default_para(int id)
    {
        this.id=id;
        System.out.println(id);
        
    }
     public Constructor_default_para(String name1)
     {
         name =name1;
         System.out.println(name);
     }
    public static void main(String[] args) {
         
    Constructor_default_para obj=new Constructor_default_para();
    Constructor_default_para ob2=new Constructor_default_para(8);
    Constructor_default_para obj1=new Constructor_default_para("surya");
}
}
