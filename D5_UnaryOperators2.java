/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programpractice;
public class D5_UnaryOperators2
{
	public static void main(String[] args)
	{
		int no1=10;
		//System.out.println(no1+++no1);
		//System.out.println(++no1+++no1);	//error
		//System.out.println(++no1-++no1);
		//System.out.println(--no1---no1);	//error
		System.out.println(--no1+--no1);//8	

                int no2=10; 
		no2 += 5;
		System.out.println(no2);
//it will first increment the number and then display the number
	}
}