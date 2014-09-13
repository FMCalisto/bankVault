class TestEmp
{

  public static void main(String[] args)
  {
  
    //  Reference variable emp* refer to separate objects of class Emp.
  
    Emp emp1 = new Emp();
    Emp emp2 = new Emp();
    Emp emp3 = new Emp();
    Emp emp4 = new Emp();
    Emp emp5 = new Emp();
    
    //  Variable bankVault of variables emp* are assigned.
    
    emp1.bankVault = 10;
    emp2.bankVault = 20;
    emp3.bankVault = 30;
    emp4.bankVault = 40;
    emp5.bankVault = 50;
    
    System.out.println(emp1.bankVault);
    System.out.println(emp2.bankVault);
    System.out.println(emp3.bankVault);
    System.out.println(emp4.bankVault);
    System.out.println(emp5.bankVault);
    
    System.out.println(Emp.bankVault); // This will print 50.
    
}
