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
public class HourlyEmployee extends Employee {

    private final static int NUMBER_OF_WEEKS = 52; 
    
    private final double hoursWorked;
    private double hourlyRate;
    private double weeklyEarnings;
    private double yearlyEarnings;
            
    public HourlyEmployee( String firstName , String lastName , String department ,
                                  double hoursWorked, double hourlyRate){
        super(firstName , lastName , department);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
    
    @Override
    public void setWeeklyEarnings(double weeklyEarnings) {
        this.weeklyEarnings = weeklyEarnings;
    }

    @Override
    public double getWeeklyEarnings() {
        weeklyEarnings = hourlyRate * hoursWorked;
        return weeklyEarnings;
    }

    @Override
    public void setYearlyEarnings(double yearlyEarnings) {
        this.yearlyEarnings = yearlyEarnings;
    }

    @Override
    public double getYearlyEarnings() {
        yearlyEarnings = weeklyEarnings * NUMBER_OF_WEEKS;
        return yearlyEarnings;
    }

    @Override
    public String toString() {
        return super.toString() + "\nHourlyRate: $" + hourlyRate +
                "\nWeekly Take Home: $" + this.getWeeklyEarnings();
    }

    
}
