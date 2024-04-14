/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programpractice;
// To find power of a number

public class B7_PowerofANumber
{
	public static void main(String args[])
        {
        int number= 2, power=10, result;
        CalculatePower c1= new CalculatePower(number, power);
        result=c1.calculate();
        System.out.println(result);
        }
}

class CalculatePower
{
	int number,power, result=1;
	public CalculatePower(int number, int power)
	{
		this.number= number;
		this.power=power;
	}
	
	public int calculate()
	{
		//result= (int)Math.pow(number,power);		
		for(int i=0 ; i<power; i++)
		{
			result= result*number;
		}
		return result;
	}

}