/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programpractice;
class B1_DownTrianglePattern
{
	public static void main(String args[])
	{
		int num=5;
		for(int i=0; i<num; i++)
		{
		
			for(int j=0; j<i; j++)
			{
				System.out.print("_");
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
		
		
	}
}