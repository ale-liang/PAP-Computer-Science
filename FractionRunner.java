public class FractionRunner
{
   public static void main(String[] args)
   {
      Fraction myOneHalf = new Fraction(1,2);
      System.out.println(myOneHalf);
      System.out.println("The numerator is " + myOneHalf.getNumerator() );
      Fraction mySeven = new Fraction(7);
      System.out.println(mySeven);
      Fraction myThreeandTwoThirds = new Fraction(3,2,3);
      System.out.println(myThreeandTwoThirds);   
      System.out.println(myOneHalf.multiply(myThreeandTwoThirds));
      System.out.println(myOneHalf + " * " + myThreeandTwoThirds + " = " + myThreeandTwoThirds.multiply(myOneHalf));
      System.out.println("The reciprocal of " + myOneHalf  + " is " + myOneHalf.reciprocal());
      System.out.println(myOneHalf + " / " + mySeven + " is " + myOneHalf.divide(mySeven));
      Fraction myNineThirds = new Fraction(9,3);
      System.out.println(myNineThirds);
      System.out.println(myOneHalf.multiply(5));   
      System.out.println(myThreeandTwoThirds.subtract(myOneHalf));
      System.out.println(myThreeandTwoThirds.add(myOneHalf));   
   
   }
}