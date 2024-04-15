
package programpractice;

class ComplexValues
{
    double real1, img1;
    public static void main(String[] args) 
    {       
    ComplexValues cv1=new ComplexValues(5.5,4);  
    ComplexValues cv2=new ComplexValues(1.2, 3.5);
    fun(cv1,cv2);
    }    
    
    public ComplexValues(double r1,double m1)
    {
       this.real1=r1;
       this.img1=m1;
    }
    
  static void fun(ComplexValues cvv1,ComplexValues cvv2)
    {        
        double resultReal, resultImg;
//        System.out.println("Value is "+cvv1.img1);
//        System.out.println("Value is "+cvv2.img1);
        resultReal= cvv1.real1+cvv2.real1;
        resultImg= cvv1.img1+cvv2.img1;
        
        System.out.println(resultReal+" + "+resultImg+"i");
        
    }
    
}

