import static java.lang.System.*;
import java.util.*;

public class GradeCalculatorRunner
{
   public static void main(String [] args)
   {
      Scanner kb = new Scanner(System.in);
      GradeCalculator test = new GradeCalculator();
      String dGrades = "";
      int dGradeP = 0;
      String mGrades = "";
      int mGradeP = 0;
      String rwGrades = "";
      
      System.out.print("List out daily grades :: ");
      dGrades = kb.nextLine();
      System.out.print("What is the daily grade percentage (integer)? :: ");
      dGradeP = kb.nextInt();
      kb.nextLine();
      System.out.print("List out major grades :: ");
      mGrades = kb.nextLine();
      System.out.print("What is the major grade percentage (integer)? :: ");
      mGradeP = kb.nextInt();
      kb.nextLine();
      System.out.print("List out reading and writing grades :: ");
      rwGrades = kb.nextLine();
      System.out.println("");
      test.setGrades(dGrades, dGradeP, mGrades, mGradeP, rwGrades);
      System.out.print("Your daily grade average is ");
      System.out.println(String.format("%.2f", test.getDailyAverage()));
      System.out.print("Your major grade average is ");
      System.out.println(String.format("%.2f",test.getMajorAverage()));
      System.out.print("Your reading and writing grade average is ");
      System.out.println(String.format("%.2f",test.getRWAverage()));
      
      System.out.println("Your average for this class is " + test.getClassGrade());
      if(test.getClassGrade() >= 90)
         System.out.println("Your class letter grade is an A");
      else if(test.getClassGrade() >= 80 && test.getClassGrade() <= 89)
         System.out.println("Your class letter grade is a B");
      else if(test.getClassGrade() >= 70 && test.getClassGrade() <= 79)
         System.out.println("Your class letter grade is a C");
      else if(test.getClassGrade() < 70)
         System.out.println("Your class letter grade is a F");
   }
}
