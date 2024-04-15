/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programpractice;

/**
 *
 * @author mehak
 */
public class C1_AreaRactangle {
    public static void main(String[] args) {
        
        double length=10 , breadth=20, area;
        CalculateArea c1= new CalculateArea(length, breadth);
        area=c1.findArea();
        System.out.println("Area is "+area);
        
    }
}
class CalculateArea
{
    double l, b, a;
    public CalculateArea(double length, double breadth)
    {
        l=length;
        b= breadth;
    }
            
    double findArea()
    {
        a= l*b;
        return a;
    }
}
