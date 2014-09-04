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
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    Employee e1 = new HourlyEmployee("Alex", "Plouff", "Produce", 40 , 12);
    Employee e2 = new SalaryEmployee("Scott" , "Plouff" , "Sales" , 75000);
    Employee e3 = new SalaryPlusCommissionEmployee("Jamie" , "Plouff" , "Design" , 80000);
    
    Employee employees [] = new Employee[3];
    employees[0] = e1;
    employees[1] = e2;
    employees[2] = e3;
    
    for (Employee employee : employees)
            System.out.println(employee +"\n");
    }
    
}
