public class LetterRemoverRunner
{
   public static void main(String[] args)
   {
      LetterRemover test = new LetterRemover("I am Sam I am",   'a' );
      System.out.println(test);
      test.setRemover("ssssssssxssssesssssesss",   's');
      System.out.println(test);
      test.setRemover("qwertyqwertyqwerty",   'a');
      System.out.println(test);
      test.setRemover("abababababa",   'b');
      System.out.println(test);
      test.setRemover("abaababababa",   'x');
      System.out.println(test);
   }

}
