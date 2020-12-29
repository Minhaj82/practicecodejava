/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB6OOP;

/**
 *
 * @author ASUS
 */
public class Fraction {
    
    private int numerator;
    private int denominator;

       public Fraction(int numerator,int denominator)
       {
           this.numerator  = numerator;
           this.denominator=denominator;
       }
     public String toString()
       {
    	if(denominator % numerator != 0)
            return numerator+"/"+denominator;
        else
            return "1"+"/"+(denominator/numerator);  
       }
      //int GCD(int a, int b) 
      //{
    	  //return "1"+"/"+(this.denominator/this.numerator); 
	  //}*/
     public void setNumerator(int numerator)
   	   {
   		this.numerator=numerator;
   	   }
   	public void setDenominator(int denominator)
   	   {
   		this.denominator=denominator;
   	   }
    public int getNumerator()
      {
  		return this.numerator;
  	  }
  	public int getDenominator()
      {
  		return this.denominator;
  	}
     public void add(Fraction fraction)
       {
          
          this.numerator   = (this.numerator*fraction.denominator)+(fraction.numerator*this.denominator);
          this.denominator = this.denominator*fraction.denominator;
          
          //int div= GCD(this.numerator, this.denominator);
     	  //this.numerator/=div;
     	 // this.denominator/=div;
       }
    
	public void sub(Fraction fraction)
      {
       
       this.numerator   = ((this.numerator*fraction.denominator)-(fraction.numerator*this.denominator));
       this.denominator =   this.denominator*fraction.denominator;   	 
     }
    public void multi(Fraction fraction)
    {
       
       this.numerator  = (this.numerator*fraction.numerator);
       this.denominator= (this.denominator*fraction.denominator);
     	 
    }
    public void divi(Fraction fraction)
    {
      
       this.numerator  = (this.numerator*fraction.denominator);
       this.denominator= (this.denominator*fraction.numerator);
    }
       
	public static void main(String[] args) {
		
		 Fraction f1 = new Fraction(1,3);
	     System.out.println(f1);
	        
	     Fraction f2 = new Fraction(1,6);
	     System.out.println(f2);
	           
	     f1.add(f2);
	     System.out.println(f1);
	    
	     f1= new Fraction(1,3); 
	     f1.sub(f2);
	     System.out.println(f1);
	     
	     f1= new Fraction(1,3); 	     
	     f1.multi(f2);
	     System.out.println(f1);
	     //System.out.println(f1.getNumerator());
	     //System.out.println(f1.getDenominator());
	     
	     f1= new Fraction(1,3);
	     f1.divi(f2);
	     System.out.println(f1);
	         	
	     //System.out.println(f1.getDenominator());
	}

}
//https://codippa.com/how-to-work-with-fractions-in-java/