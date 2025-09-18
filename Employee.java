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
        int eligableToDrive = false;
        if age >= 16;
            eligableToDrive = true;
            return eligableToDrive;
        else;
            System.out.println(16 - age + " years left.");
            return eligableToDrive;
    }

    /*
     * Returns the net pay for the outstanding unpaid hours
     */
    private double calculatePay(double hoursWorked){
        unpaidHours = hoursWorked;
        double netSalary = hourlyWage * unpaidHours;
        double totalSalary = netSalary - (netSalary * 0.3);
        return totalSalary;
    }

    /*
     * Output the payment record and resets unpaid hours
     */
    public void paySalary(double timeWorked){
        double salary = calculatePay(timeWorked);
        System.out.println(fullname + " has received a wire transfer of " + salary + " CAD");
        unpaidHours = 0.0;
    }
    
    public setName(String fullname){
        this.fullname = fullname;
    }
    
    public String getName(){
        return fullname;
    }
}