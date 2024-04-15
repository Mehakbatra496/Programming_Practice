/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programpractice;

/**
 *
 * @author mehak
 */
class A4_RightDownPattern
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=0 ; i<n ; i++)
		{
			for(int j=i ; j<=5; j++)
			{
				System.out.print(" ");
			}
			
			for(int k=0; k<=i; k++)
			{
				System.out.print("*");
			}
			
			System.out.println(" ");
		}
	}

}