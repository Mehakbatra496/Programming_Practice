/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programpractice;

/**
 *
 * @author mehak
 */
public class D2_SumOfDigits {
    public static void main(String[] args) {
        
        int num=1000;
        int sum=0; int quo=0;
        
        while(num!=0)
        {
            quo= num%10;
            
            num=num/10;
            
            sum=sum+quo;
        }
        
        System.out.println(sum);
        
    }
}
