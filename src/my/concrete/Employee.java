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
public class Employee {
    
    private String firstName;
    
    private String lastName;
    
    private String employeeID;
    
    
    
    public Employee( String firstName, String lastName, 
                            String employeeID){
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeID = employeeID;
        
    }
    
    public void setFirstName( String firstName ){
        this.firstName = firstName;
    }
    
    public String getFirstName(){
        return firstName;
    }
    
    public void setLastName( String lastName ){
        this.lastName = lastName;
    }
    
    public String getLastName(){
         return lastName;
    }
    
    public void setEmployeeID( String employeeID ){
        this.employeeID = employeeID;
    }
    
    public String getEmployeeID(){
        return employeeID;
    }
    
    public String toString(){
        return firstName + lastName + employeeID;
    }
//    public static void main(String[] args) {
//        
//        Employee e1 = new Employee( "Alex " , "Plouff ", "P520");
//        Employee e2 = new Employee( "Scott ", "Plouff " , "E340");
//        
//        System.out.println(e1.toString() + "\n" + e2.toString());
//    }
}
