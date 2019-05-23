import java.util.*;
import java.lang.System.*;
public class SemesterExamGradeRunner
{
   public static void main(String [] args)
   {
      Scanner kb = new Scanner(System.in);
      System.out.print("What is your first nine weeks grade? :: ");
      int nWO = kb.nextInt();
      kb.nextLine();
      System.out.print("What is your second nine weeks grade? :: ");
      int nWT = kb.nextInt();
      kb.nextLine();
      System.out.print("What is your desired semester grade? :: ");
      int dGrade = kb.nextInt();
      SemesterExamGrade test = new SemesterExamGrade(nWO,nWT,dGrade);
      if(test.getSemesterGrade() <= 100)
      {
      System.out.println("You need to get a " + test.getSemesterGrade() + " on your semester final.");
      }
      else if(test.getSemesterGrade() > 100)
      {
         System.out.println("It is impossible to achieve this grade.");
      }
   }
}