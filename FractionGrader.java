public class FractionGrader
{
   public static void main(String[] args)
   {
      Fraction myOneHalf = new Fraction(1,2);
      Fraction myTwoThirds = new Fraction(4,6);
      System.out.println("1/2 = " + myOneHalf);
      System.out.println("2/3 = " + myTwoThirds);
      System.out.println("1 = "+myOneHalf.getNumerator() );
      Fraction myTen = new Fraction(10);
      System.out.println("10/1 = "+myTen);
      Fraction myTwoAndThreeFourths = new Fraction(2,3,4);
      Fraction myThreeAndTwoSixths = new Fraction(3,2,6);
      System.out.println("11/4 = "+myTwoAndThreeFourths);
      System.out.println("10/3 = "+myThreeAndTwoSixths);
      System.out.println("1/3 = "+myOneHalf.multiply(myTwoThirds));
      System.out.println("7/6 = "+myOneHalf.add(myTwoThirds));
      System.out.println("1/6 = "+myTwoThirds.subtract(myOneHalf));
      System.out.println("2/1 = "+myOneHalf.reciprocal());
      System.out.println("1/20 = "+myOneHalf.divide(myTen));
      System.out.println("5/1 = "+myOneHalf.multiply(10));
      myOneHalf.simplify(); //this line should cause a compile error - verify and then make it a comment
   }
}