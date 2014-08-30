/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package my.concrete;

/**
 *
 * @author Alex
 */
public class HourlyEmployee extends Employee {

    private double hourlyRate;
    private double hoursWorked;
    private Employee e;
    
    public HourlyEmployee( double hourlyRate, double hoursWorked, Employee e) {
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
        this.e = e;
    }
    
    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }   
    
    public double getWeeklyPay(){
        return hoursWorked * hourlyRate;
    }
    
    @Override
    public String toString(){

        return e.toString() + "\n" + "Wage: $" + hourlyRate + "/hour\n" + "Hours Worked: "
                                + hoursWorked + "\nThis Weeks Pay: " + this.getWeeklyPay() ; 
    }
}
