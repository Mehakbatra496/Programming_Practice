/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programpractice;

/**
 *
 * @author mehak
 */
public class C9_RemoveWhite 
{
    public static void main(String[] args)
    {
        String st1= "My.name.is..Mehak.Batra.mm";         
        char[] ch1= new char[st1.length()];
        ch1=st1.toCharArray();
//        int i;
        int len=ch1.length;
        for(int i=0; i<len-1; i++)
        {
           if(st1.charAt(i)==46)
            {
//                System.out.println("found "+ i);
                
                for(int j=i; j<len-1;j++)
                {                    System.out.println("i is "+ch1[i]+" "+i);

                    System.out.println("j is "+ch1[j]+" "+j);
                    int k=j+1;
                    System.out.println("j+1 is "+ch1[k]+" "+k);
                    
                    System.out.println("Going to replace.....................");
                    ch1[j]=ch1[k];
                    
                    
                    
                    
                }
                len=len-1;
//                break;
                System.out.println("");
                System.out.println("");
                System.out.println("");

            }
        }
       
        for(int i=0; i<len; i++)
        {
            System.out.print(ch1[i]);
        } 
        
    }
}
