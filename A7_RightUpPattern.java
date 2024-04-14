/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programpractice;
class A7_RightUpPattern
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<i; j++)
			{
				System.out.print(" ");
			}
			for(int k=i; k<5; k++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
			
		}
		
	}
}