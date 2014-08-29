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

    public HourlyEmployee(String firstName, String lastName, String employeeID,
                                    double hourlyRate, double hoursWorked) {
        super(firstName, lastName, employeeID);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
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
    
    public double getWeeklyPayAmount(){
        return hourlyRate * hoursWorked;
    }
    
    
    public static void main(String[] args) {
        
        HourlyEmployee he1 = new HourlyEmployee( "Alex " , "Plouff " , "E101 " , 12 , 40  );
        
        System.out.println(he1.toString());
    }
    
    
}
