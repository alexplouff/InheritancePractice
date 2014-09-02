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
public class SalaryEmployee implements Employee{
    
    private String firstName;
    private String lastName;
    private String department;
    
    private double salary;

    public SalaryEmployee(String firstName, String lastName, String department, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.salary = salary;
    }
    
    public SalaryEmployee(){}
       
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    public String toString(){

        return "Name: " + firstName + " " + lastName
                + "\nDepartment: " + department + 
                "\nTotal Earned This Year: $" + this.getSalary();
    }

}
