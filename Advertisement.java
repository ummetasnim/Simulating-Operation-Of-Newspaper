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
public class Advertisement implements Serializable { 
    private String adv;
    public void setAdv(String str) 
    {  
      adv=str;  
    } 
    @Override
    public String toString() {
        return "Advertisement{" + "adv=" + adv + '}';
    }
    
}
