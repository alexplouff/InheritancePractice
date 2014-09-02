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
public abstract class Employee {
    
    private String firstName;
    private String lastName;
    private String department ;
    
    private double monthlyEarnings;
    private double yearlyEarnings;
    
    public Employee( String firstName , String lastName , String department){
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
  
    public void setDepartment( String department ){
        this.department = department;
    }
    
    public String getDepartment(){
        return department;
    }
    
    public abstract void setWeeklyEarnings( double weeklyEarnings );
    
    public abstract double getWeeklyEarnings();
    
    public abstract void setYearlyEarnings( double yearlyEarnings );
    
    public abstract double getYearlyEarnings();
    
    @Override
    public String toString (){
        return "Name: " + firstName + " " + lastName + 
                "\nDepartment: " + department;
    }
}
