/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programpractice;

/**
 *
 * @author mehak
 */
public class C9_ArrayHighest {
    public static void main(String[] args) {
        int arr[]= {12,45,65};
        int big=0;
        System.out.println("length is "+ arr.length);
        for(int i=0; i<arr.length; i++)
        {
            //big=arr[i];
            for(int j=i+1; j<arr.length; j++)
            {
//                if(arr[j]>arr[i])
//                {
//                    big=arr[j];
//                    break;
//                }
               
                
                System.out.println("i is "+i);
                                System.out.println("j is......... "+j);

            }
        }
        
        System.out.println("big is "+big);
    }
}
