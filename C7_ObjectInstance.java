/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programpractice;

/**
 *
 * @author mehak
 */
public class C7_ObjectInstance {
    public static void main(String[] args) 
    {
        Abc a1= new Abc();
        Abc a2= new Abc();
        a1.fun();
                a1.fun2();

        a2.fun2();      
    }
}

class Abc
{
    int x=5;   
    void fun()
    {    
        x=x-2;
//        System.out.println(x);
    } 
      void fun2()
    {       
        System.out.println(x);
    } 
    
}
