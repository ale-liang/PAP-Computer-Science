import java.util.Scanner;

public class HexToBinaryChecker

{
   public static void main(String [] args)
   {
      Scanner keyboard = new Scanner(System.in);
      System.out.print("Enter a letter :: ");
      char mychar = keyboard.findInLine(".").charAt(0);
      HexToBinary test = new HexToBinary(mychar);
      System.out.println(test);
      
      System.out.print("Enter a letter :: ");
      mychar = keyboard.next().charAt(0);
      test.setHex(mychar);
      test.getBinary();
      System.out.println(test);
      
      System.out.print("Enter a letter :: ");
      mychar = keyboard.next().charAt(0);
      test.setHex(mychar);
      test.getBinary();
      System.out.println(test);
      
      System.out.print("Enter a letter :: ");
      mychar = keyboard.next().charAt(0);
      test.setHex(mychar);
      test.getBinary();
      System.out.println(test);
      System.out.print("Enter a letter :: ");
      mychar = keyboard.next().charAt(0);
      test.setHex(mychar);
      test.getBinary();
      System.out.println(test);
      System.out.print("Enter a letter :: ");
      mychar = keyboard.next().charAt(0);
      test.setHex(mychar);
      test.getBinary();
      System.out.println(test);
      
      System.out.print("Enter a letter :: ");
      mychar = keyboard.next().charAt(0);
      test.setHex(mychar);
      test.getBinary();
      System.out.println(test);
       }

}