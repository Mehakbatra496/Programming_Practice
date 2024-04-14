/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programpractice;

/**
 *
 * @author mehak
 */
class A9_RightTrianglePattern
{
	public static void main(String args[])
	{
		int num=5;
		for(int i=0; i<num; i++)
		{
			for(int j=i; j<num; j++)
			{
				System.out.print(" ");
			}
			for(int k=0; k<=i; k++)
			{
				System.out.print("*");
			}			
			
			System.out.println(" ");
						
		}
		
		for(int m=1; m<num; m++)
		{
		
			for(int b=0; b<=m; b++)
			{
				System.out.print(" ");
			}
			for(int n= m; n<num; n++)
			{
				System.out.print("*");
			}
			
			System.out.println(" ");
		}
	}
}