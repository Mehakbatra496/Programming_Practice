/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programpractice;

/**
 *
 * @author mehak
 */
public class C2_AreaCircle {
    public static void main(String[] args) {
        
        double radius=7, area;
        CalculateArea c1= new CalculateArea(radius);
        area=c1.findArea();
        System.out.println("Area of circle is "+area);
        double peri=c1.findperi();
        System.out.println("Perimeter is "+peri);
        
    }
}
class CalculateArea
{
    double l, b, a,r,p;
    public CalculateArea(double radius)
    {
        r=radius;
    }
            
    double findArea()
    {
        a= (Math.PI)*r*r;
        return a;
    }
    double findperi()
    {
        p=2*r*(Math.PI);
        return p;
    }
}
