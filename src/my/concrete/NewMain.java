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
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Employee e1 = new Employee( "Alex" , "Plouff" , "E102" );
        Employee e2 = new Employee( "Scott" , "Plouff" , "R201");
        
        e1 = new SalariedEmployee( e1 , 75000 );
        e2 = new SalariedEmployee ( e2 , 80000 );
        
        e1 = new SalaryPlusCommissionEmployee( (SalariedEmployee) e1);
        e2 = new SalaryPlusCommissionEmployee( (SalariedEmployee) e2);
        
        System.out.println(e1 + "\n\n" + e2);
        
        
    }
    
}
