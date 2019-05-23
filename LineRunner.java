import java.lang.Math;
public class LineRunner
{
	public static void main( String[] args )
   {
		//add test cases	- initialize instance variables with the constructor for
		// one test case and then use the setCoordinates method to change the values 
		// for the other test cases	
		Line test = new Line(0,0,0,0);
      test.setCoordinates(1,9,14,2);
      test.calculateSlope();
      test.print();
      
      Line test1 = new Line(0,0,0,0);
      test1.setCoordinates(1,7,18,3);
      test1.calculateSlope();
      test1.print();
      
      Line test2 = new Line(0,0,0,0);
      test2.setCoordinates(6,4,2,2);
      test2.calculateSlope();
      test2.print();
      
      Line test3 = new Line(0,0,0,0);
      test3.setCoordinates(4,4,5,3);
      test3.calculateSlope();
      test3.print();
      
      Line test4 = new Line(0,0,0,0);
      test4.setCoordinates(1,1,2,9);
      test4.calculateSlope();
      test4.print();
	}
}
