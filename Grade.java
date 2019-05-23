public class Grade
{
	private int numGrade;

	public Grade()
	{
   numGrade = 0;
	}

	public Grade(int grade)
	{
   numGrade = grade;
	}

	public void setGrade(int grade)
	{
   numGrade = grade;
	}

	public String getLetterGrade( )
	{
   String letGrade = "";
   if (numGrade >= 90)
      {
		letGrade="A";
      }
   else if (numGrade >= 80)
      {
      letGrade = "B";
      }
   else if (numGrade >= 75)
      {
      letGrade = "C";
      }
   else if (numGrade >= 70)
      {
      letGrade = "D";
      }
   else   
      letGrade = "F";
      
      
      
		return letGrade;
	}

	public String toString()
	{
		return numGrade + " is a " + getLetterGrade() + "\n";
	}
}
