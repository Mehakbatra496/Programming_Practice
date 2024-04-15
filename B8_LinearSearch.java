/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programpractice;
import java.awt.FileDialog;
import java.util.Scanner;
/**
 *
 * @author mehak
 */
public class B8_LinearSearch {
    public static void main(String[] args) {
        
        int[] arr = {43,77,65,1,45,77,90,32,45};
        int position=-1,i;
        boolean flag= false;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the element ");
        int s=sc.nextInt();
        for( i=0; i<arr.length; i++)
        {
            if(s==arr[i])
            {
                flag =true;
                position= (i+1);
                break;
            }
        }
        
        if(flag==true)
        {
            System.out.println("Item found at "+position);
        }
        else
        {
            System.out.println("Item not found");
        }
        
    }
}
