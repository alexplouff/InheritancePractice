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
        Employee e2 = new Employee( "Scott" , "Plouff" ,"R201");
        Employee e3 = new Employee( "Ashley" , "Plouff" , "F422");
        Employee e4 = new Employee( "Jamie" , "Plouff" , "A233");
        Employee e5 = new Employee( "Cindy" , "Plouff" , "D322");
        
        e1 = new HourlyEmployee( 15 , 40 , e1 );
        e2 = new HourlyEmployee( 20 , 40 , e2 );
        
        e3 = new SalariedEmployee( e3 , 65000 );
        
        e4 = new SalariedEmployee( e4 , 75000 );
        e5 = new SalariedEmployee( e5 , 80000 );
        
        e4 = new SalaryPlusCommissionEmployee( (SalariedEmployee) e4);
        e5 = new SalaryPlusCommissionEmployee( (SalariedEmployee) e5);
        
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
