/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programpractice;

/**
 *
 * @author mehak
 */
public class B9_BinarySearch 
    {
        public static void main(String[] args)
        {
            int arr[] ={2,25,37,39,48,52,67,78,89,95,101};
            int beg=0,end=(arr.length)-1,item=37;
            boolean flag=false;
            int position=0;
            
            while((beg<=end))
            {
              int  mid=(beg+end)/2;
                System.out.println(mid+" "+arr[mid]);
                if(item==arr[mid])
                {
                    flag=true;
                    position = mid;
                    break;
                }
                if(item>arr[mid])
                {
                    
                    beg=mid+1;
                }
                else
                {
                    end=mid-1;
                }
                flag=false;
//        System.out.println("calculating..." +mid);

            }
            if(flag==true)
            {
                System.out.println("Item found at "+(position+1));
            }
            else
            {
                System.out.println("Item not found");
            }
                    


        }
    }
