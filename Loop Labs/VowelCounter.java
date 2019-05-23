public class VowelCounter
{









   public static String getNumberString(String test)
   {
      int bop = 0;
      for(int n = 0; n < test.length(); n = n + 1)
         {
            if(test.charAt(n) == 65 || test.charAt(n) == 69 ||test.charAt(n) == 73 ||test.charAt(n) == 79 ||test.charAt(n) == 85 ||test.charAt(n) == 97 ||test.charAt(n) == 101 ||test.charAt(n) == 105 ||test.charAt(n) == 111 ||test.charAt(n) == 117)
               {
               test = test.replaceFirst("" + test.charAt(n),"" + bop);
               bop = bop + 1;
                  if(bop > 9)
                  {
                  bop = 0;
                  }
                 
               }
         }
       return test;   
      

   }

}
