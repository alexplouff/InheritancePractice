/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package my.Abstract;

/**
 *
 * @author Alex
 */
public class SalaryEmployee extends Employee {

    private final static int NUMBER_OF_WEEKS = 52; 
    private double salary;
    private double weeklyEarnings;
    private double yearlyEarnings;
    
    public SalaryEmployee( String firstName , String lastName , String department, 
                                      double salary ){
        super(firstName , lastName , department);
        this.salary = salary;
    }
    
    
    @Override
    public void setWeeklyEarnings(double weeklyEarnings) {
        this.weeklyEarnings = weeklyEarnings;
    }

    @Override
    public double getWeeklyEarnings() {
        weeklyEarnings = salary / NUMBER_OF_WEEKS;
        return weeklyEarnings;
    }

    @Override
    public void setYearlyEarnings(double yearlyEarnings) {
        this.yearlyEarnings = yearlyEarnings;
    }

    @Override
    public double getYearlyEarnings() {
        yearlyEarnings = salary;
        return yearlyEarnings;
    }
    
    @Override
    public String toString(){
        return super.toString() + "\nWeekly Earnings: $" + getWeeklyEarnings() 
                + "\nYearly Earnings: $" + getYearlyEarnings();
    }   
    
}
