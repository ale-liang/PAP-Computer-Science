public class ArrayFunHouseRunner
{
   public static void main( String args[] )
   {
      int[] one = {7, 4, 10, 0, 1, 7, 6, 5, 3, 2, 9, 7};
      ArrayFunHouse Arrays = new ArrayFunHouse();
      System.out.println(Arrays.toString(one));
      System.out.println("sum of spots 3-6  =  " + ArrayFunHouse.getSum(one,3,6));
      System.out.println("sum of spots 2-9  =  " + ArrayFunHouse.getSum(one,2,9));
      System.out.println("# of 4s  =  " + ArrayFunHouse.getCount(one,4));
      System.out.println("# of 9s  =  " + ArrayFunHouse.getCount(one,9));
      System.out.println("# of 7s  =  " + ArrayFunHouse.getCount(one,7));
      System.out.println("before removing all 7s " + Arrays.toString(one));
      one = ArrayFunHouse.removeVals(one,7);
      System.out.println("after removing all 7s " + Arrays.toString(one));
      System.out.println("# of 7s  =  " + ArrayFunHouse.getCount(one,7));

      int[] two = {4,2,3,4,6,7,8,9,0,10,0,1,7,6,5,3,2,9,9,8,7};

      System.out.println("\n\n"+Arrays.toString(two));
      System.out.println("sum of spots 3-16  =  " + ArrayFunHouse.getSum(two,3,16));
      System.out.println("sum of spots 2-9  =  " + ArrayFunHouse.getSum(two,2,9));
      System.out.println("# of 0s  =  " + ArrayFunHouse.getCount(two,0));
      System.out.println("# of 3s  =  " + ArrayFunHouse.getCount(two,3));
      System.out.println("# of 7s  =  " + ArrayFunHouse.getCount(two,7));
      two = ArrayFunHouse.removeVals(two,7);
      System.out.println("new array with all 7s removed = " + Arrays.toString(two));
      System.out.println("# of 7s  =  " + ArrayFunHouse.getCount(two,7));
   }
}
