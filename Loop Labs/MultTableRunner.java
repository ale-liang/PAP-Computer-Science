import java.util.Scanner;
import java.lang.System.*;

public class MultTableRunner
{

   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      
      System.out.print("Generate multiplication table for :: ");
      int multiple = keyboard.nextInt();
      System.out.print("How many entries would you like? :: ");
      int entry = keyboard.nextInt();
      MultTable test = new MultTable(multiple,entry);
      System.out.println("multiplication table for " + multiple);
      test.printTable();
      
      System.out.print("Generate multiplication table for :: ");
      int multiple1 = keyboard.nextInt();
      System.out.print("How many entries would you like? :: ");
      int entry1 = keyboard.nextInt();
      MultTable test1 = new MultTable(multiple1,entry1);
      System.out.println("multiplication table for " + multiple1);
      test1.printTable();
      
      System.out.print("Generate multiplication table for :: ");
      int multiple2 = keyboard.nextInt();
      System.out.print("How many entries would you like? :: ");
      int entry2 = keyboard.nextInt();
      MultTable test2 = new MultTable(multiple2,entry2);
      System.out.println("multiplication table for " + multiple2);
      test2.printTable();
   }

}