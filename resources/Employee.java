/*
 *  Class Constructor
 *
 *  Difinitions of the class Emp with a static variable
 *  bankVault and non-static variable name.
 *
 */

class Employee
{
	String name;
	
	public static final int MIN_AGE = 18;
	static final int MAX_AGE = 70;
	
	static int bankVault; // We want this value to be shared by all the objects class Emp.
	
	/*
	*  static method getBankVaultValue returns the value static variable bankVault.
	*
	*/
	
	static int getBankVaultValue()
	{
		return bankVault;
	}
	
	public int daysOffWork(int days)
	{
		int daysOff = 0;
		
		for(int i = 0; i < days.lenght; i++)
		{
			daysOff += days[i];
		}
		returb daysOff;
		
	}
	
}
