public class SemesterExamGrade
{
   private int nineWeekOne, nineWeekTwo, desiredGrade;
   
   public SemesterExamGrade() //constructor
   {
      nineWeekOne = 0;
      nineWeekTwo = 0;
   }
   
   public SemesterExamGrade(int nWO, int nWT, int dGrade) //overloaded constructor
   {
      nineWeekOne = nWO;
      nineWeekTwo = nWT;
      desiredGrade = dGrade;
   }
   
   public void setGrade(int nWO, int nWT, int dGrade) //mutator method
   {
      nineWeekOne = nWO;
      nineWeekTwo = nWT;
      desiredGrade = dGrade;
   }
   
   public int getSemesterGrade() //calculate needed semester exam grade
   {
      int SemExamGrade = 0;
      double total = 0;
      total = (double) (desiredGrade * 100 - nineWeekOne * 42.5 - nineWeekTwo * 42.5);
      total = total / 15 - 3;
         if(total < 0)
         {
            total = 0;
         }
      SemExamGrade = (int)(Math.round(total)); 
      return SemExamGrade;
   }
}