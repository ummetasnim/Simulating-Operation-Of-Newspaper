/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelclass;

import java.io.Serializable;
import java.time.LocalDate;
//import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author ummet
 */
public class Employee implements Serializable {
    private String firstName, lastName;
    private LocalDate dateofjoining;
    private String designation,contactnumber,workschedule,salary; 

    //public Employee(String firstName, String lastName, String dateofjoining,  
      //                  String designation,String contactnumber, String workschedule, int salary)  
    public Employee(String firstName, String lastName, String designation,LocalDate dateofjoining,  
                        String contactnumber, String workschedule, String salary)  
    
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateofjoining = dateofjoining;
        this.designation = designation;
        this.contactnumber = contactnumber;
        this.workschedule = workschedule;
        this.salary = salary;
    }

    public String  getFirstName() {
        return firstName;
    }

    public void setFirstName(String  firstName) {
        this.firstName = firstName;
    }
  
    public String  getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDateofjoining() {
        return dateofjoining;
    }

    public void setDateofjoining(String LocalDate) {
        this.dateofjoining = dateofjoining;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getContactnumber() {
        return contactnumber;
    }

    public void setContactnumber(String contactnumber) {
        this.contactnumber = contactnumber;
    }

    public String getWorkschedule() {
        return workschedule;
    }

    public void setWorkschedule(String workschedule) {
        this.workschedule = workschedule;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }
    
}
