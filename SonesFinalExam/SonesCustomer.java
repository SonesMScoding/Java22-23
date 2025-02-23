/* Complete Debugging 9-2. all checks pass
rename each Java class to replace the word “Debug” with your last name. 
DebugCustomer.java will be renamed to YourLastNameCustomer.java. 

NECESSARY:
The program compiles and run without errors after all errors have been corrected; 
all 4 checkboxes in MindTap are green [X]

All files were renamed and include your last name [X]
*/
public class SonesCustomer
{
    protected int idNumber;
    protected String name;
    protected double creditLimit;
    public SonesCustomer(int id, String name, double credit)
    {
       idNumber = id;
       this.name = name;
       creditLimit = credit;
    }
    public void display()
    {
       System.out.println("Customer #" + idNumber +
          " Name: " +  name + "\nCredit limit $" + creditLimit);
    }
}

