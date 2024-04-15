/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programpractice;
class B3_HallowRactangle
{
	public static void main(String args[])
	{
		int num=5;
		for(int i=0; i<=num; i++)
		{
			for(int j=0; j<=num; j++)
			{
				if((i==0)||(i==num))
				{
					System.out.print("* ");
				}
				else
				{
					if((j==0)||(j==5))
					{
						System.out.print("* ");
					}
					else
					System.out.print("  ");
				}
				
			}
			System.out.println(" ");
		}		
	}
}