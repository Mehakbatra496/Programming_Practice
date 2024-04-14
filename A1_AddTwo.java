/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programpractice;
import java.util.Scanner;

/**
 *
 * @author mehak
 */
public class A1_AddTwo
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a=0 , b=0, c,t;
        Scanner sc= new Scanner(System.in);
                
        if(sc.hasNextInt())   // Scanner class method to check whether tthe next input by user is int
        {
            
           a=sc.nextInt(); 
           if(sc.hasNextInt())
            {
                     b=sc.nextInt();
                     
            }
           else 
            {
                System.out.println("Invalid input");
            }
        }
        
        
        else 
        {
            System.out.println("Invalid input");
        }
           
                    c=a+b;
                     System.out.println(c); 
  
    
                     
                      for(int i=0; i<3; i++)
                        {
                           if( sc.hasNextInt())
                           {
                                t=sc.nextInt();
//                                System.out.println(a);
                           }
                           else{
                                System.out.println("Invalid input");
                               }
                        }                           

    }
    
}
    

   

    
    

