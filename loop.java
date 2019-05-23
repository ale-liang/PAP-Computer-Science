public class loop
{


 

public static double go( double w )

{

   while(w > 0)

   {

      w = w - 0.75;

   }

   return w;

}


 public static void main(String[] args)
   {
  System.out.println(go(3.5));
int total=0;

for(int s=1; s<7; s++)

{

   total=total+s;

}

System.out.println(total);
}
}   