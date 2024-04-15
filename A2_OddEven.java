/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programpractice;
import java.util.Scanner;
class A2_OddEven
{

	public static void main(String args[])
	{
		int number ;
		Scanner sc= new Scanner(System.in);
		number= sc.nextInt();
		
		if(number%2==0)
		{
			System.out.print("Number is even");
		}
		else
		{
			System.out.print("Number is odd");
		}
		
	}

}