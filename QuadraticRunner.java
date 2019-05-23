import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class QuadraticRunner
{
	public static void main( String[] args )
   {
   	//add test cases
   	Scanner keyboard = new Scanner(in);

		out.print("Enter a :: ");
		int quadA = keyboard.nextInt();

		out.print("Enter b :: ");
		int quadB = keyboard.nextInt();

		out.print("Enter c :: ");
		int quadC = keyboard.nextInt();

		Quadratic test = new Quadratic(quadA, quadB, quadC);
		test.calcRoots();
		test.print();

   			out.print("Enter a :: ");
		 quadA = keyboard.nextInt();

		out.print("Enter b :: ");
		 quadB = keyboard.nextInt();

		out.print("Enter c :: ");
		 quadC = keyboard.nextInt();

		Quadratic test1 = new Quadratic(quadA, quadB, quadC);
		test1.calcRoots();
		test1.print();
		
		out.print("Enter a :: ");
		 quadA = keyboard.nextInt();

		out.print("Enter b :: ");
		 quadB = keyboard.nextInt();

		out.print("Enter c :: ");
		 quadC = keyboard.nextInt();

		Quadratic test2 = new Quadratic(quadA, quadB, quadC);
		test2.calcRoots();
		test2.print();
	}
}
