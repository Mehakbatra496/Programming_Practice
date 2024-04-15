/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programpractice;
class A6_LeftUpPattern
{
	public static void main(String args[])
	{
	    int n=5;
		for (int i=0; i<n ; i++)
		{
			for(int j=5; j>i; j--)
			{
				System.out.print("*");
			}
							System.out.println(" ");
		}
	}
}