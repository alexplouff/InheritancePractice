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
    
    public SalariedEmployee ( String firstName , String lastName , 
                             String employeeID , double salary ){
        super( firstName , lastName , employeeID );
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    public double getMonthlyPay() {
        monthlyPay = salary / MONTHS_IN_YEAR;
        return monthlyPay;
    }
    
    @Override
    public String toString () {
        return super.toString() + "\nSalary: $" + salary 
                        + "\nMonthly Take Home: $" + this.getMonthlyPay();
    }    
  
}
