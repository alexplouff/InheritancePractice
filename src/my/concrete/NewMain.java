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
        
        
        Employee e1 = new HourlyEmployee( "Alex" , "Plouff" , "E102" , 15 , 40 );
        Employee e2 = new HourlyEmployee( "Scott" , "Plouff" ,"R201" , 20 , 40 );
        Employee e3 = new SalariedEmployee( "Ashley" , "Plouff" , "F422" , 50000);
        Employee e4 = new SalaryPlusCommissionEmployee(  "Jamie" , "Plouff" , "A233" , 65000 );
        Employee e5 = new SalaryPlusCommissionEmployee( "Cindy" , "Plouff" , "D322" , 70000 );
        
        Employee [] employees = new Employee [ 5 ] ;
        employees[0] = e1;
        employees[1] = e2;
        employees[2] = e3;
        employees[3] = e4;
        employees[4] = e5;
        
        for (Employee e : employees)
            System.out.println(e+"\n");
        
        
        
    }
    
}
