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
public class SalaryPlusCommissionEmployee extends SalariedEmployee {
    
    private final double commissionRate = .03;
    private double commissionMade;
    private double weeklyTakeHome;
    private SalariedEmployee se;
    
    public SalaryPlusCommissionEmployee( SalariedEmployee se ){
        this.se = se;
    }

    public SalariedEmployee getSe() {
        return se;
    }

    public double getCommissionMade() {
        commissionMade = se.getSalary() * commissionRate;
        return commissionMade;
    }

    public void setCommissionMade(double commissionMade) {
        this.commissionMade = commissionMade;
    }

    public void setSe(SalariedEmployee se) {
        this.se = se;
    }
    
    public double getWeeklyTakeHome(){
        weeklyTakeHome = se.getSalary() + this.commissionMade;        
        return weeklyTakeHome;
    }
    
    public String toString () {
        return  se.toString() +
                "\nCommission: $" + this.getCommissionMade();
    }
}
