/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programpractice;
public class C3_BubbleSort {
    public static void main(String[] args) {
        
        int arr[]= {10,55,25,6}; //6 total elements
        int n= arr.length,temp,i=0,j=0;
        
        for( i=0; i<(n-1); i++) //total  6 times 
        {
            System.out.println("Before");
            for(int k=0; k<(n-i)-1; k++)
             {
                     System.out.print(arr[k]+" ");
             }
           
            System.out.println("i is ..............."+i);
            
            for( j=0; j<(n-i)-1; j++)
            {
                if(arr[j]>arr[j+1])
                {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]= temp;
                }
            }
            
            System.out.println("After");
            for(int k=0; k<(n-i)-1; k++)
             {
             System.out.print(arr[k]+" ");
             }
            System.out.println("j is ..............."+j);
            System.out.println("");


              
        }
        
        System.out.println("");
        System.out.println("Array elements are ");
      
        for(int k=0; k<arr.length; k++)
        {
        System.out.print(arr[k]+" ");
        }
//        
    }
}
