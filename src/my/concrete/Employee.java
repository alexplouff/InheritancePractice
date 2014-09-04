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
                        String employeeID ) 
    {
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
    
    @Override
    public String toString(){
        return "Name: " + firstName + " " + lastName + "\n" + "Employee ID: " + employeeID;
    }

}
