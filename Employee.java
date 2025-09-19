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
     * Employee full name Getter
     */
    public Employee(String fullname){
    Get.Display(fullname);
    fullname=fullname  
}

    /**
     * Employee full name Setter
     */
    public employee(int fullname){
    this.fullname=fullname
    fullname=John Deere
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
        if(age <= 16);
        printf("uneligeable to drive until 16 years old or above");
        
    }

    /*
     * Returns the net pay for the outstanding unpaid hours
     */
    private double calculatePay(){
        if(unpaidhours= 0)
        printf("hours worked x hourly wage")
        if(tax=30%)
        printf(:"hours worked x hourly wage x 30% t
    }

    /*
     * Output the payment record and resets unpaid hours
     */
    public void paySalary(){
        // to be completed
    }
}