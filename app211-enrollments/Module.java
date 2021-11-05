
/**
 * Encapsulates the functions and data regarding Modules
 *
 * @author Thomas Holt
 * @version 4/11/2021
 */
public class Module
{
    // instance variables - replace the example below with your own
    private int x;
    private String code;
    private String title;
    private int credit;

    /**
     * Constructor for objects of class Module
     */
    public Module(String code, String title)
    {
        // initialise instance variables
        this.code = code;
        this.title = title;
        credit = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param
     * @return code
     */
    public String getCode()
    {
        // put your code here
        return this.code;
    }

    /**
     * @return title
     */
    public String getTitle()
    {
        // put your code here
        return this.title;
    }
    /**
     * @return credit
     */
    public int getCredit()
    {
        // put your code here
        return this.credit;
    }
    /**
     * @Set Credit
     */
    public void setCredit(int credit)
    {
        this.credit = credit;
    }
    
    /**
     * Print the details of the module; title, code and credit value
     */
    public void print()
    {
        //printHeading
        
        System.out.println(" Module Code: " + code + ":" + title);
        System.out.println(" Credit " + credit);
        
    }
}
