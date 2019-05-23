import static java.lang.System.*;
import java.util.*;

public class GradeCalculator
{
   private String dailyGrades, majorGrades, rwGrades;
   private int dailyPercent, majorPercent;
  
   
   public GradeCalculator() //constructor
   {
      dailyGrades = "";
      majorGrades = "";
      rwGrades = "";
      dailyPercent = 0;
      majorPercent = 0;
   }
   
   public GradeCalculator(String dailyS, int dailyP, String majorS, int majorP, String rw) //overloaded constructor
   {
      dailyGrades = dailyS;
      majorGrades = majorS;
      rwGrades = rw;
      dailyPercent = dailyP;
      majorPercent = majorP;
   }
   
   public void setGrades(String dailyS, int dailyP, String majorS, int majorP, String rw) //method mutator
   {
      dailyGrades = dailyS;
      majorGrades = majorS;
      rwGrades = rw;
      dailyPercent = dailyP;
      majorPercent = majorP;
   }
   
   public double getDailyAverage() // calculate daily grade average
   {
      Scanner dg = new Scanner(dailyGrades);
      double dGradeAvg = 0;
      
      int numAmt = 0;
      int total = 0;
      while(dg.hasNext())
         {
            if(dg.hasNext())
            {
            total = total + (int)dg.nextInt();
            numAmt ++;
            }
         }
     dGradeAvg = (double) total / numAmt;
     return dGradeAvg;
   }
   
   public double getMajorAverage() //calculate major grade avg
   {
      Scanner dg = new Scanner(majorGrades);
      double mGradeAvg = 0;
      
      int numAmt = 0;
      int total = 0;
      while(dg.hasNext())
         {
            if(dg.hasNext())
            {
            total = total + (int)dg.nextInt();
            numAmt ++;
            }
         }
     mGradeAvg = (double) total / numAmt;
     return mGradeAvg;   
   }
   
   public double getRWAverage() //calculate reading and writing average
   {
      Scanner dg = new Scanner(rwGrades);
      double rwGradeAvg = 0;
    
      int numAmt = 0;
      int total = 0;
      while(dg.hasNext())
         {
            if(dg.hasNext())
            {
            total = total + (int)dg.nextInt();
            numAmt ++;
            }
         }
     rwGradeAvg = (double) total / numAmt;
     return rwGradeAvg;
   }
   
   public int getClassGrade() // calculate class avg
   {
      double dGrade = getDailyAverage();
      double mGrade = getMajorAverage();
      double rwGrade = getRWAverage();
      int classGrade = 0;
      classGrade = (int)(Math.round(dGrade * dailyPercent / 100 + mGrade * majorPercent / 100 + rwGrade * 5 / 100));
      return classGrade;
   }
   
}