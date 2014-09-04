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
    
    private static final double COMMISSION_RATE = .03;
    private double commissionMade;
    private double weeklyTakeHome;
    
    public SalaryPlusCommissionEmployee ( String firstName, String lastName,    
                                            String department ,double salary){
        super( firstName , lastName , department , salary );
    }
    
    public double getCommissionMade() {
        commissionMade = getSalary() * COMMISSION_RATE;
        return commissionMade;
    }

    public void setCommissionMade(double commissionMade) {
        this.commissionMade = commissionMade;
    }
    
    public double getWeeklyTakeHome(){
        weeklyTakeHome = getSalary() + this.commissionMade;        
        return weeklyTakeHome;
    }
    
    @Override
    public String toString(){
        return super.toString() + "\nCommission Made: $" + this.getCommissionMade() + 
                "\nTotal Made This Year: $" + getWeeklyTakeHome();
    }

}
