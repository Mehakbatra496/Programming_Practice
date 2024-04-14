/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programpractice;

/**
 *
 * @author mehak
 */
import java.util.Scanner;

public class B5_SimpleInterest
{
	public static void main(String args[])
	{
		double p, r, total;
		int  t;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Principal, Rate of interest and time");
		p=sc.nextDouble();
		r= sc.nextDouble();
		t= sc.nextInt();
		
		CalculateInterest c1= new CalculateInterest(p,r,t);
		total=c1.calculate();
		System.out.println("Total amount is " + total);
	}	
}	

class CalculateInterest
{
        double p, r, total;
        int  t;
		
	public CalculateInterest(double p, double r, int t)
	{
		this.p=p;
		this.r=r;
		this.t=t;
	}
	public double calculate()
	{
		total= (p*r*t)/100;
		total= total+p;                
		return total;
		
	}
	
	
}

