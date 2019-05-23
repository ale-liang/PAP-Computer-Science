import java.lang.Math;


public class Fraction
{
   private int numerator, denominator;
   
   //constructors
   public Fraction(int num, int den)
   {
      numerator = num;
      denominator = den;
      simplify();
   }   
   
   public Fraction(int num)
   {
      numerator = num;
      denominator = 1;
      
   }
   
   public Fraction(int whole, int num, int den)
   {
   numerator = whole * den + num;
   denominator = den;
   simplify();
   }

   public int getNumerator()
   {
   return numerator;
   }

   public int getDenominator()
   {
   return denominator;
   }

   public String toString()
   {
   return numerator + "/" + denominator; 
   }

   public Fraction multiply(Fraction other)
   {
      Fraction result = new Fraction(this.numerator*other.getNumerator(), this.denominator*other.getDenominator() );
      return result;
   }

   public Fraction reciprocal()
   {
      return new Fraction(this.denominator,this.numerator);
   }

   public Fraction divide(Fraction other)
   {
      Fraction result = new Fraction(this.numerator * other.reciprocal().getNumerator(), this.denominator * other.reciprocal().getDenominator());
      return result;
   }

   public Fraction add(Fraction other)
   {
      Fraction result = new Fraction(this.numerator*other.getDenominator() + other.getNumerator() * this.denominator, this.denominator * other.getDenominator());
      return result;
   }

   public Fraction subtract(Fraction other)
   {
      Fraction result = new Fraction(this.numerator*other.getDenominator() - other.getNumerator() * this.denominator, this.denominator * other.getDenominator());
      return result;
   }

   public Fraction multiply(int operand)
   {
      Fraction result = new Fraction(this.numerator * operand, this.denominator);
      return result;
   }
   
   private void simplify()
   {
   
   for(int n = (Math.min(numerator,denominator)); n > 0; n = n-1)
      if(numerator%n == 0 && denominator % n ==0)
         {
         numerator = numerator / n;
         denominator = denominator / n;
         }
   
   
   }
}