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
    
    private static final double COMMISSION_RATE = .03;
    private double commissionMade;
    private double weeklyTakeHome;
    
    public SalaryPlusCommissionEmployee( String firstName , String lastName , 
                                        String employeeID , double salary){
        super( firstName , lastName , employeeID , salary );
        
    }

    public double getCommissionMade() {
        commissionMade = super.getSalary() * COMMISSION_RATE;
        return commissionMade;
    }

    public void setCommissionMade(double commissionMade) {
        this.commissionMade = commissionMade;
    }
    
    public double getWeeklyTakeHome(){
        weeklyTakeHome = super.getSalary() + this.commissionMade;        
        return weeklyTakeHome;
    }
    
    @Override
    public String toString () {
        return  super.toString() +
                "\nCommission: $" + this.getCommissionMade();
    }
}
