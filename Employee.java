import lang.stride.*;

/**
 * Consider this incomplete Employee class to answer some questions of your exam
 * @author Tassia @version 0.1
 */
public class Employee
{
    private String fullname;
    private int yearOfBirth;
    private boolean onLeave;
    private double hourlyWage;
    private double unpaidHours;

    /**
     * 
     */
    public Employee(String fullname, int yearOfBirth, double hourlyWage)
    {
        this.fullname = fullname;
        this.yearOfBirth = yearOfBirth;
        this.hourlyWage = hourlyWage;
        onLeave = false;
        unpaidHours = 11;
    }

    /**
     * Setter method fullname
     */
    public Employee(String fullname)
    {
        fullname = fullname;
    }

    /**
     * Getter method fullname
     */
    public int getFullname(int fullname)
    {
        return (fullname);
    }

    /**
     * Returns true is an employee is above 16 years old  
     */
    private int calculateAge(int currentYear)
    {
        return (currentYear - yearOfBirth);
    }

    /**
     * Returns true is an employee is above 16 years old
     */
    public boolean canDrive()
    {
        int age = calculateAge(2025);
        if (age >= 16) {
            System.out.println("can drive");
        }
        if (age <= 16) {
            System.out.println("uneligeable to drive until 16 years old or above");
        }
    }

    /**
     * 
     */
    private double calculatePay()
    {
        if (unpaidHours == 11) {
            System.out.println("Pay + 30% tax + unpaidHours amount");
        }
       }

    /* Output the payment record and resets unpaid hours*/

    /**
     * 
     */
    public void paySalary()
    {
        /* Unsupported feature in Stride : = in expression*/
        if (unpaidHours == 11) {
            System.out.println("total pay");
        }
    }
}
