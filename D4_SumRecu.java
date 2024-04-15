/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programpractice;

/**
 *
 * @author mehak
 */
public class D4_SumRecu {
    
        
        static int num=2222;
        static int sum=0, quo=0;
        
        public static void main(String[] args)
        {
            fun(num);   
        }
    
        static void fun(int num)
        {
          quo=num%10;
          num=num/10;
          sum=sum+quo;
          
          if(num==0)
          {
              System.out.println(sum);            
          }
          else
          {
              System.out.println("done");
          fun(num);
          }
          
        }
}
