/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelclass;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author ummet
 */
    public class Transport implements Serializable { 
     private int noofpeople,noofvechile; 
     private String time,place,name,assigndetails;  
     private LocalDate date; 
      
     public Transport(String assigndetails) {
        this.assigndetails = assigndetails;
    }
    public Transport(String place, String time, LocalDate date) {
        this.place = place; 
        this.time = time;
        this.date = date; 
    }
    
    public Transport(int noofpeople, int noofvechile, String time, String place, String name, 
         LocalDate date)  
    {
        this.noofpeople = noofpeople;
        this.noofvechile = noofvechile;
        this.time = time;
        this.place = place;
        this.name = name;
        this.date = date; 
        this.assigndetails = assigndetails;
    }

    public void setAssigndetails(String assigndetails) {
        this.assigndetails = assigndetails;
    }

    public String getAssigndetails() {
        return assigndetails;
    }
    public int getNoofpeople() {
        return noofpeople;
    }

    public void setNoofpeople(int noofpeople) {
        this.noofpeople = noofpeople;
    }

    public int getNoofvechile() {
        return noofvechile;
    }

    public void setNoofvechile(int noofvechile) {
        this.noofvechile = noofvechile;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Transport{" + "noofpeople=" + noofpeople + ", noofvechile=" + noofvechile + ", time=" + time + ", place=" + place + ", name=" + name + ", assigndetails=" + assigndetails + ", date=" + date + '}';
    }
    
   
}
