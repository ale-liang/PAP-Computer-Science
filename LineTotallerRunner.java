import java.util.*;
import static java.lang.System.*;

public class LineTotallerRunner
{
   public static void main( String args[] )
   {
	   LineTotaller test = new LineTotaller("1 2 3 4 5 6");
		out.println(test);
		out.println("sum = " + test.getSum() + "\n\n");
      
      test.setLine("10 20 30 40 50 60");
      out.println(test);
      out.println("sum = " + test.getSum() + "\n\n"); 
      
            test.setLine("250 657 2154 345 6796");
      out.println(test);
      out.println("sum = " + test.getSum() + "\n\n"); 
      
            test.setLine("0");
      out.println(test);
      out.println("sum = " + test.getSum() + "\n\n"); 
      
            test.setLine("-99 45 -98 92 87");
      out.println(test);
      out.println("sum = " + test.getSum() + "\n\n"); 
      
            test.setLine("2 4 6 8 10");
      out.println(test);
      out.println("sum = " + test.getSum() + "\n\n"); 
      
            test.setLine("-2 4 -6 8 -10");
      out.println(test);
      out.println("sum = " + test.getSum() + "\n\n"); 
      
            test.setLine("1 11 121 1331 14641");
      out.println(test);
      out.println("sum = " + test.getSum() + "\n\n"); 
      
            test.setLine("1 1 2 5 8 13 21");
      out.println(test);
      out.println("sum = " + test.getSum() + "\n\n"); 
      
            test.setLine("12 14 15 17 18");
      out.println(test);
      out.println("sum = " + test.getSum() + "\n\n"); 
    }
}

