import java.util.Scanner;

public class GradeChecker
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      System.out.print("Enter a number grade :: ");
      int myint = keyboard.nextInt();
      Grade test = new Grade(myint);
      System.out.println(test);
      
      System.out.print("Enter a number grade :: ");
      int myint1 = keyboard.nextInt();
      Grade test1 = new Grade(myint1);
      System.out.println(test1);
      
      System.out.print("Enter a number grade :: ");
      int myint2 = keyboard.nextInt();
      Grade test2 = new Grade(myint2);
      System.out.println(test2);
      
      System.out.print("Enter a number grade :: ");
      int myint3 = keyboard.nextInt();
      Grade test3 = new Grade(myint3);
      System.out.println(test3);
      
      System.out.print("Enter a number grade :: ");
      int myint4 = keyboard.nextInt();
      Grade test4 = new Grade(myint4);
      System.out.println(test4);
      
      System.out.print("Enter a number grade :: ");
      int myint5 = keyboard.nextInt();
      Grade test5 = new Grade(myint5);
      System.out.println(test5);
      
      System.out.print("Enter a number grade :: ");
      int myint6 = keyboard.nextInt();
      Grade test6 = new Grade(myint6);
      System.out.println(test6);
      
      System.out.print("Enter a number grade :: ");
      int myint7 = keyboard.nextInt();
      Grade test7 = new Grade(myint7);
      System.out.println(test7);
   }
}