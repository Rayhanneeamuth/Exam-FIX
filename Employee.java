/**
 * Consider this incomplete Employee class to answer some questions of your exam
 *
 * @author Tassia
 * @version 0.1
 */
public class Employee{
    private String fullname;
    private int yearOfBirth;
    private boolean onLeave;
    private double hourlyWage;
    private double unpaidHours;

        public Employee(String fullname, int yearOfBirth, double hourlyWage){
        this.fullname = fullname;
        this.yearOfBirth = yearOfBirth;
        this.hourlyWage = hourlyWage;
        onLeave = false;
        unpaidHours = 0.0;
    }
    
    /**
     * Full name 
     */
        public Employee(String fullname){
        fullname= fullname;
    }
    /**
     * Full name
     */
        public Employee(){
        return fullname;
        }
    
    /**
     * Returns true is an employee is above 16 years old
     */
        private int calculateAge(int currentYear){
        return (currentYear - yearOfBirth);
    }

    /**
     * Returns true is an employee is above 16 years old
     */
        public boolean canDrive(){
        int age = calculateAge(2025);
        if(age >= 16);
        printf("can drive");
        if(age<= 16)
        printf("uneligeable to drive until 16 years old or above");
        
    }

    /*
     * Returns the net pay for the outstanding unpaid hours
     */
        private double calculatePay(){
        if(unpaidHours> 0)
        printf("hours worked x hourly wage");
        
        
        
    }

    /*
     * Output the payment record and resets unpaid hours
     */
    public void paySalary(){
        if(hoursworked= 0)
        printf("total pay");
        if(unpaidhours>= 0)
        printf("Total pay - unpaid hours x hourly wage");
    }
}