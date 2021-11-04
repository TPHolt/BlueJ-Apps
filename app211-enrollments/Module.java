
/**
 * Write a description of class Module here.
 *
 * @author Thomas Holt
 * @version 1.0 30/10/21
 */
public class Module
{
 private String code;
    // The full title including qualification and subject
    private String title;
    private int creditValue;
    private int newCreditValue;
    
    /**
     * Create A new module
     */
    public Module (String code, String title, int creditValue)
    {
        this.code = code;
        this.title = title;
        this.creditValue = creditValue;
    }

    /**
     * Change Credit Value
     */
    public Module (int newCreditValue)
    {
       
        this.newCreditValue = creditValue;
    }

    
    /**
     * Print the details of the module, the list
     * of students enrolled and the module
     */
    public void print()
    {
        printHeading();
        
        System.out.println(" Module Code: " + code + ": " + title);
        System.out.println("Credit Value: " + creditValue);
    }
    
    
    /**
     * Print out the details of the course to the terminal.
     */
    private void printHeading()
    {
        System.out.println(" --------------------------------");
        System.out.println("   App211: Course Details");
        System.out.println(" --------------------------------");
        System.out.println();
    }
}
