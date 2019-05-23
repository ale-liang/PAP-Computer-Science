import static java.lang.System.*;
import java.util.Scanner;

public class MonsterRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
         out.print("Enter 1st monster's name : ");
         String test = keyboard.next();
         out.print("Enter 1st monster's size : ");
         int test1 = keyboard.nextInt();
         Monster mOne = new Monster(test,test1);
         
         out.print("Enter 2nd monster's name : ");
         String test2 = keyboard.next();
         out.print("Enter 2nd monster's size : ");
         int test3 = keyboard.nextInt();
         Monster mTwo = new Monster(test2,test3);
         
         out.println("Monster 1 - " + mOne);
         out.println("Monster 2 - " + mTwo + "\n"); 
         
         if(mOne.isBigger(mTwo))
		{
			out.println("Monster one is bigger than Monster two.");
		}
		if(mOne.isSmaller(mTwo))
		{
			out.println("Monster one is smaller than Monster two.");
		}
		if(mOne.namesTheSame(mTwo))
		{
			out.println("Monster one has the same name as Monster two.");
		}
      else
         {out.println("Monster one does not have the same name as Monster two.");
         }
        
        out.print("Enter 1st monster's name : ");
         String test4 = keyboard.next();
         out.print("Enter 1st monster's size : ");
         int test5 = keyboard.nextInt();
         Monster mOne1 = new Monster(test4,test5);
         
         out.print("Enter 2nd monster's name : ");
         String test6 = keyboard.next();
         out.print("Enter 2nd monster's size : ");
         int test7 = keyboard.nextInt();
         Monster mTwo1 = new Monster(test6,test7);
         
         out.println("Monster 1 - " + mOne1);
         out.println("Monster 2 - " + mTwo1 + "\n");
         if(mOne1.isBigger(mTwo1))
		{
			out.println("Monster one is bigger than Monster two.");
		}
		if(mOne1.isSmaller(mTwo1))
		{
			out.println("Monster one is smaller than Monster two.");
		}
		if(mOne1.namesTheSame(mTwo1))
		{
			out.println("Monster one has the same name as Monster two.");
		}
      else
         {out.println("Monster one does not have the same name as Monster two.");
         }
         
        out.print("Enter 1st monster's name : ");
         String test8 = keyboard.next();
         out.print("Enter 1st monster's size : ");
         int test9 = keyboard.nextInt();
         Monster mOne2 = new Monster(test8,test9);
         
         out.print("Enter 2nd monster's name : ");
         String test10 = keyboard.next();
         out.print("Enter 2nd monster's size : ");
         int test11 = keyboard.nextInt();
         Monster mTwo2 = new Monster(test10,test11);
         
         out.println("Monster 1 - " + mOne2);
         out.println("Monster 2 - " + mTwo2 + "\n");
         if(mOne2.isBigger(mTwo2))
		{
			out.println("Monster one is bigger than Monster two.");
		}
		if(mOne2.isSmaller(mTwo2))
		{
			out.println("Monster one is smaller than Monster two.");
		}
		if(mOne2.namesTheSame(mTwo2))
		{
			out.println("Monster one has the same name as Monster two.");
		}
      else
         {out.println("Monster one does not have the same name as Monster two.");
         }

	
	}
}
