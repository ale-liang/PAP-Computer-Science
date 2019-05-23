import java.util.*;

public class TriangleThreeRunner
{
	public static void main( String args[] )
   {
      Scanner kb = new Scanner(System.in);
      String choice = "Y";
		do{

			
         
			//ask for size of triangle
         System.out.print("How big is your triangle? ");
         int size = kb.nextInt();
			//ask for letter to use
         kb.nextLine();
         System.out.print("What letter do you want to make your triangle with? ");
         String let = kb.nextLine();
         
			//ask for triangle orientation (maybe 1 or 2)
         System.out.print("How do you want your triangle oriented? (Big on Bottom) 1 or (Big on Top) 2 :: ");
         int orient = kb.nextInt();
         System.out.print("Do you want your triangle on the (Left) 1 or (Right) 2? :: ");
          int direction = kb.nextInt();
         if(orient == 1)
            {
               if(direction == 1)
               {
                  
                  System.out.println(TriangleThree.createTriBigOnBottom(let,size));
               }
               if(direction == 2)
               {
                  
                  System.out.println(TriangleThree.createTriBigOnBottomRight(let,size));
               }
            } 
         else if(orient == 2)
            {
               if(direction == 1)
               {
                  
                  System.out.println(TriangleThree.createTriBigOnTop(let,size));
               }
               if(direction == 2)
               {
                 
                  System.out.println(TriangleThree.createTriBigOnTopRight(let,size));
               }
            }
         else
            {
            System.out.print("Please try again. Choose orientation (Big on Bottom) 1 or (Big on Top) 2 :: ");
            orient = kb.nextInt();
            }

               
			//call the appropriate static method
			//ask if they want to enter more data
			   System.out.print("Would you like to make another triangle? ");
            kb.nextLine();
            choice = kb.nextLine();
		}while(choice.equals("Y")||choice.equals("y"));
	}
}
