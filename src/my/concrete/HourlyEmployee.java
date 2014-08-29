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
    Employee e;
    
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
    
    public static void main(String[] args) {
        
        Employee e1 = new Employee ("Alex" , "Plouff" , "E102");
        Employee e2= new Employee ("Scott" , "Plouff" , "S402");
        
        e1 = new HourlyEmployee ( 20 , 6 , e1);
        e2 = new HourlyEmployee ( 15 , 32 , e2);
        System.out.println(e1.toString() + "\n\n" + e2.toString());
    }
    
    
}
