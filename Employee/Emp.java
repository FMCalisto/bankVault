/*
 *  Class Constructor
 *
 *  Difinitions of the class Emp with a static variable
 *  bankVault and non-static variable name.
 *
 */

class Emp
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
  
}
