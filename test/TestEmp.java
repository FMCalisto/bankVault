class TestEmployee
{

  public static void main(String[] args)
  {
  
    //  Reference variable emp* refer to separate objects of class Emp.
  
    Employee emp1 = new Employee();
    Employee emp2 = new Employee();
    Employee emp3 = new Employee();
    Employee emp4 = new Employee();
    Employee emp5 = new Employee();
    
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
    
    System.out.println(Employee.bankVault); // This will print 50.
    
}
