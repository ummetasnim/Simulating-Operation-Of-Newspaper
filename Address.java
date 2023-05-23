/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelclass;

import java.io.Serializable;

/**
 *
 * @author ummet
 */
public class Address implements Serializable {
    private int houseno,roadno; 
    private String street,thana,district,city; 
    private int zipcode; 

    public Address(int houseno, int roadno, String street, String thana, String district, String city, int zipcode) {
        this.houseno = houseno;
        this.roadno = roadno;
        this.street = street;
        this.thana = thana;
        this.district = district;
        this.city = city;
        this.zipcode = zipcode;
    }

    public int getHouseno() {
        return houseno;
    }

    public void setHouseno(int houseno) {
        this.houseno = houseno;
    }

    public int getRoadno() {
        return roadno;
    }

    public void setRoadno(int roadno) {
        this.roadno = roadno;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getThana() {
        return thana;
    }

    public void setThana(String thana) {
        this.thana = thana;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }  
    
    @Override
    public String toString() {
        return "Address{" + "houseno=" + houseno + ", roadno=" + roadno + ", street=" + street + ", thana=" + thana + ", district=" + district + ", city=" + city + ", zipcode=" + zipcode + '}';
    }
    
}
