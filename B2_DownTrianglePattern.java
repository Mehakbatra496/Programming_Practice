/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programpractice;
class B2_DownTrianglePattern
{
	public static void main(String args[])
	{
		int num=5;
		for(int i=0; i<num; i++)
		{
		
			for(int j=0; j<i; j++)
			{
				System.out.print("-");
			}
			for(int k=i; k<num; k++)
			{
				System.out.print("*");
			} 
			
			for(int m=i+1; m<num; m++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
			
		}
		for(int b=1; b<=num; b++)
		{
			for(int c=b; c<num; c++ )
			{
		 	 	System.out.print("-");
			}
			for(int d=0;d<b; d++)
			{
				System.out.print("*");
			}
			for(int e=1; e<b; e++)
			{
				System.out.print("*");
			}
			
			System.out.println(" ");			
		}
		
		
	}
}