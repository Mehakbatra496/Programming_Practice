/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programpractice;

/**
 *
 * @author mehak
 */
public class C6_PrimeNumber {
    public static void main(String[] args) {
        int num=77;
        boolean flag=true;
        
        for(int i=2; i<num/2; i++)
        {
            if(num%i==0)
            {
                flag=false;
                break;
            }
            else
            {
                
            }
            
        }
        
        if(flag==true)
        {
            System.out.println("It is a prime number");
        }
        else
        {
                        System.err.println("It is not prime number");

        }
        
    }
}
