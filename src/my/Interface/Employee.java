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
public interface Employee {
    
    public abstract void setFirstName( String firstName );
    
    public abstract String getFirstName();
    
    public abstract void setLastName( String lastName );
    
    public abstract String getLastName();
    
    public abstract void setDepartment( String department);
    
    public abstract String getDepartment();
    
    public abstract String toString();
    
}
