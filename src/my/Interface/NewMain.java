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
public class NewMain {
    
    public static void main(String[] args) {
        
    
    
    Employee hourly = new HourlyEmployee( "Alex" , "Plouff" , "Produce" , 12 , 40 );
    Employee salaryEmployee = new SalaryEmployee( "Alex" , "Plouff" , "Produce" , 50000);
    
    Employee salaryPlus = new SalaryEmployee("Alex" , "plouff" , "produce" , 75000);
    SalaryPlusCommissionEmployee salaryc = new SalaryPlusCommissionEmployee( (SalaryEmployee) salaryPlus );
        
    Employee [] employees = new Employee [3];
    
    employees[0] = hourly;
    employees[1] = salaryEmployee;
    employees[2] = salaryc;
    
    for(Employee e : employees)
            System.out.println(e);
    
    }
}
