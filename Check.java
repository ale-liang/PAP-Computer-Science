public class Check

{  

   private int one, two, total;      

 

   public void setNums(int n1, int n2)

   {

      one = n1;

      two = n2;

   }

 

   public void add()

   {

      one = 5;

      total = one + two;

      two = 5;

   }

 

   public String toString()

   {

      return "" + total;

   }

}