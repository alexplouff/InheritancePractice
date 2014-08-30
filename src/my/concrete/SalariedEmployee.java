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
public class SalariedEmployee extends Employee{
    
    private double salary;
    private final static int MONTHS_IN_YEAR = 12;
    private double monthlyPay;
    private Employee employee;
    
    public SalariedEmployee ( Employee employee , double salary ){
        this.salary = salary;
        this.employee = employee;
    }
    
    public SalariedEmployee(  ) {}

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
    
    public double getMonthlyPay() {
        monthlyPay = salary / MONTHS_IN_YEAR;
        return monthlyPay;
    }
    
    @Override
    public String toString () {
        return employee.toString() + "\nSalary: $" + salary 
                        + "\nMonthly Take Home: $" + this.getMonthlyPay();
    }    
}
