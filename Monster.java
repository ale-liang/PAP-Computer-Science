public class Monster
{
	private String name;
	private int howBig;	

	public Monster()
	{
      name = "";
      howBig = 0;

	}

	public Monster(String n, int size)
	{
      name = n;
      howBig = size;

	}

	public String getName()
	{
		return name;
	}
	
	public int getHowBig()
	{
		return howBig;
	}
	
	public boolean isBigger(Monster other)
	{
   if (howBig <= other.getHowBig())
      {
		return false;
      }

   return true;

	}
	
	public boolean isSmaller(Monster other)
	{
	if (isBigger(other))
      {
		return false;
      }
      return true;
    
	}

	public boolean namesTheSame(Monster other)
	{
   if (name.equals(other.getName()))
      {
      return true;
      }
	return false;
	}
	
	public String toString()
	{
		return name + " " + howBig;
	}
}
