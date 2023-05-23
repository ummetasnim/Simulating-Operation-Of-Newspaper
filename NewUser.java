/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelclass;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author ummet
 */
public class NewUser implements Serializable { 
    private String name,type;
    private LocalDate birthday;
    private int contactNo;

    public NewUser(String name, String type, LocalDate birthday, int contactNo) {
        this.name = name;
        this.type = type;
        this.birthday = birthday;
        this.contactNo = contactNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public int getContactNo() {
        return contactNo;
    }

    public void setContactNo(int contactNo) {
        this.contactNo = contactNo;
    } 
    public int getAge(){
        return Period.between(birthday, LocalDate.now()).getYears();
    }
}
