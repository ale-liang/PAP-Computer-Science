import java.util.Scanner;
public class inputLab
{
   public static void main(String[] args)
   {
      Scanner key = new Scanner(System.in);
      System.out.print("Enter an integer:: ");
      int myInt1 = key.nextInt();
      key.nextLine();
      System.out.print("Enter an integer:: ");
      int myInt2 = key.nextInt();
      System.out.println(" ");
      System.out.print("Enter a double:: ");
      double myDouble1 = key.nextDouble();
      key.nextLine();
      System.out.print("Enter a double:: ");
      double myDouble2 = key.nextDouble();
      System.out.println(" ");
      System.out.print("Enter a float:: ");
      float myFloat1 = key.nextFloat();
      key.nextLine();
      System.out.print("Enter a float:: ");
      float myFloat2 = key.nextFloat();
      System.out.println(" ");
      System.out.print("Enter a short:: ");
      short myShort1 = key.nextShort();
      key.nextLine();
      System.out.print("Enter a short:: ");
      short myShort2 = key.nextShort();
      System.out.println(" ");
      System.out.println("integer one = " + myInt1);
      System.out.println("integer two = " + myInt2);
      System.out.println(" ");
      System.out.println("double one = " + myDouble1);
      System.out.println("double two = " + myDouble2);
      System.out.println(" ");
      System.out.println("float one = " + myFloat1);
      System.out.println("float two = " + myFloat2);
      System.out.println(" ");
      System.out.println("short one = " + myShort1);
      System.out.println("short two = " + myShort2);
      System.out.println(" ");
   }
}