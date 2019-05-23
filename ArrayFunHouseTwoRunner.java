import java.util.*;

public class ArrayFunHouseTwoRunner
{
   public static void main(String[] args)
   {
      int[] one = {1,2,3,4,5,6,7,8,9,10};
      System.out.println(Arrays.toString(one));
      if(ArrayFunHouseTwo.goingUp(one) == true)
         {System.out.println("is going Up? true");}
      else
         {System.out.println("is going Up? false");}
      
      int[] two = {1,2,3,9,11,20,30};
            System.out.println(Arrays.toString(two));
      if(ArrayFunHouseTwo.goingUp(two) == true)
         {System.out.println("is going Up? true");}
      else
         {System.out.println("is going Up? false");}
         
      int[] three = {9,8,7,6,5,4,3,2,0,-2};
            System.out.println(Arrays.toString(three));
      if(ArrayFunHouseTwo.goingUp(three) == true)
         {System.out.println("is going Up? true");}
      else
         {System.out.println("is going Up? false");}
      
      int[] four = {3,6,9,12,15,18,21,23,19,17,15,13,11,10,9,6,3,2,1,0};
            System.out.println(Arrays.toString(four));
      if(ArrayFunHouseTwo.goingUp(four) == true)
         {System.out.println("is going Up? true");}
      else
         {System.out.println("is going Up? false");}
         
               System.out.println(Arrays.toString(one));
      if(ArrayFunHouseTwo.goingDown(one) == true)
         {System.out.println("is going Down? true");}
      else
         {System.out.println("is going Down? false");}
         
      System.out.println(Arrays.toString(two));
      if(ArrayFunHouseTwo.goingDown(two) == true)
         {System.out.println("is going Down? true");}
      else
         {System.out.println("is going Down? false");}


      System.out.println(Arrays.toString(three));
      if(ArrayFunHouseTwo.goingDown(three) == true)
         {System.out.println("is going Down? true");}
      else
         {System.out.println("is going Down? false");}


      System.out.println(Arrays.toString(four));
      if(ArrayFunHouseTwo.goingDown(four) == true)
         {System.out.println("is going Down? true");}
      else
         {System.out.println("is going Down? false");}

      
      System.out.println(Arrays.toString(four));
      System.out.println("first 7 values greater than 9 " + Arrays.toString(ArrayFunHouseTwo.getCountValuesBiggerThanX(four,7,9)));
      System.out.println("first 5 values greater than 15 " + Arrays.toString(ArrayFunHouseTwo.getCountValuesBiggerThanX(four,5,15)));
     
   }
}