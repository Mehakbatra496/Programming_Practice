/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programpractice;

/**
 *
 * @author mehak
 */
public class C4_Static {
    public static void main(String[] args)
    {
            System.out.println("Hlo");

            
            Abc.fun();
            System.out.println(Abc.k);
    }
}

class Abc
{
    static int k=5;
    static final int i =9;
    static 
    {
        System.out.println("static block.....................................");
    }
   static void fun()
    {        
        System.out.println(i);
    }

}
