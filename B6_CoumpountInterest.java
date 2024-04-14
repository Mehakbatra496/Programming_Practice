/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programpractice;

/**
 *
 * @author mehak
 */
public class B6_CoumpountInterest {

	public static void main(String args[])
	{
		double principal=1000, interest_rate=0.10, n=1, time=7, total; //7 months
		CalculateInterest c1= new CalculateInterest(principal, interest_rate, time , n);
		total=c1.calculate();
                System.out.println(total);
	}
	    
}

class CalculateInterest
{
	double p,ir,n,t, amount;
	public CalculateInterest(double principal,double interest_rate,double time ,double n)
	{
		p = principal;
		ir= interest_rate;
		t= time;
		this.n=n;
	}	
	
	public double calculate()
	{
		//amount= p*Math.pow((1+(ir/n)), (n*p));
		         amount = p * Math.pow(1 + (ir / n), n * t);
                          return amount;
		
		
	}		
}


