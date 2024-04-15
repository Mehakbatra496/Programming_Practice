/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programpractice;

/**
 *
 * @author mehak
 */
public class C8_StringPelindrom {
    public static void main(String[] args) 
    {
        String st1= "noor";
        String org=st1;
        String st2="";
        
        for(int i=st1.length()-1; i>=0; i--)
        {
            st2=st2+st1.charAt(i);
        }
        System.out.println(st1);
        System.out.println(st2);

        if(st1.equals(st2))
        {
            System.out.println("Pelindrom");
        }
        else
        {
            System.err.println("Not Pelindrom");
        }
        
    }
}