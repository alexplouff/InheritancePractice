/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package my.Interface;

/**
 *
 * @author Alex
 */
public class HourlyEmployee implements Employee {

    private String firstName;
    private String lastName;
    private String department;
    
    private double hourlyRate;
    private double hoursWorked;
    
    public HourlyEmployee (String firstName, String lastName, String department, 
                                    double hourlyRate, double hoursWorked ) {
        
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
        
    }
    
    @Override
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public void setDepartment(String department) {
        this.department = department;
    }
    
    @Override
    public String getDepartment() {
        return department;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
    
    public double getDollarsEarned(){
        return hoursWorked * hourlyRate;
    }
    
    @Override
    public String toString(){
        return "Name: " + firstName + " " + lastName
                + "\nDepartment: " + department + 
                "\nTotal Earned This Week: $" + this.getDollarsEarned();
    }

}
