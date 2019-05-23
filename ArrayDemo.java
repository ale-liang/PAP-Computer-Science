public class ArrayDemo
{
   public static void main(String[] args)
   {
      int[] zero = new int[10];
      System.out.println(zero[5]);
      System.out.println("The 6th element is " + zero[5]+" the 1st element is " + zero[0]);
      int[] nextArray = {1,2,3,4,5,6,7,8,9};
      System.out.println("The 6th element is " + nextArray[5]+" the 1st element is " + nextArray[0]);
      String[] words = new String[10];
      words[0] = "abc";
      words[4] = "def";
      System.out.println(words[0]+", " + words[1]+", "+words[2]+",...." + words[9]);
      int slots = 10;
      int[] newArray = new int[slots];
      
      int[] numList = null;

      double[] doubleArray = new double[10];
      System.out.println("The last spot is " +doubleArray[9]);
      
   }
}