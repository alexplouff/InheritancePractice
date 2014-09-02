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
public class SalaryPlusCommissionEmployee extends SalaryEmployee {

    private static final double COMMISSION_RATE = .03;
    private double commissionMade;
    private double weeklyEarnings;
    
    public SalaryPlusCommissionEmployee(String firstName, String lastName, String department, 
                                        double salary) {
        super(firstName, lastName, department, salary);
    }
    
    @Override
    public void setWeeklyEarnings( double weeklyEarnings){
        this.weeklyEarnings = weeklyEarnings;
    }
    
    @Override
    public double getWeeklyEarnings(){
        weeklyEarnings = ( super.getYearlyEarnings() + getCommissionMade() ) / 12;
        return weeklyEarnings;
    }

    public double getCommissionMade() {
        commissionMade = super.getYearlyEarnings() * COMMISSION_RATE;
        return commissionMade;
    }

    public void setCommissionMade(double commissionMade) {
        this.commissionMade = commissionMade;
    }
    
    @Override
    public String toString(){
        return "Name: " + super.getFirstName() + super.getLastName()
                +"\nDepartment: " + super.getDepartment()
                +"\nWeekly Earnings: " + this.getWeeklyEarnings();
    }
    
    public static void main(String[] args) {
        Employee e = new SalaryPlusCommissionEmployee( "Alex" , "Plouff" , "Produce" , 7500);
        
        System.out.println(e.toString());
    }
    
}
