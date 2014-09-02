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
public class SalaryPlusCommissionEmployee extends SalaryEmployee{
    
    private SalaryEmployee se;
    
    private static final double COMMISSION_RATE = .03;
    private double commissionMade;
    private double weeklyTakeHome;
    
    
    public SalaryPlusCommissionEmployee( SalaryEmployee se ){
        this.se = se;
    }

    public SalaryEmployee getSe() {
        return se;
    }

    public double getCommissionMade() {
        commissionMade = se.getSalary() * COMMISSION_RATE;
        return commissionMade;
    }

    public void setCommissionMade(double commissionMade) {
        this.commissionMade = commissionMade;
    }

    public void setSe(SalaryEmployee se) {
        this.se = se;
    }
    
    public double getWeeklyTakeHome(){
        weeklyTakeHome = se.getSalary() + this.commissionMade;        
        return weeklyTakeHome;
    }
    
    @Override
    public String toString(){
        return se.toString() + "\nCommission Made: $" + this.getCommissionMade() + 
                "\nTotal Made This Year: $" + getWeeklyTakeHome();
    }

}
