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
    Employee salaryc = new SalaryPlusCommissionEmployee( "Scott" , "Plouff" , "Sales" , 80000 );
        
    Employee [] employees = new Employee [4];
    
    employees[0] = hourly;
    employees[1] = salaryEmployee;
    employees[2] = salaryPlus;
    employees[3] = salaryc;
    
    for(Employee e : employees)
            System.out.println(e+"\n");
    
    }
}
