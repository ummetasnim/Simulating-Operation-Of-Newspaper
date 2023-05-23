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
public class News implements Serializable { 
    private String heading,fullnews,rawnews; 
 
    public News() 
    {  
      heading = fullnews =rawnews = null;
    } 
    public News(String heading, String fullnews)  
    {
        this.heading = heading;
        this.fullnews = fullnews;
    } 
    public News(String heading, String fullnews, String rawnews) {
        this.heading = heading;
        this.fullnews = fullnews;
        this.rawnews = rawnews;
    }
     
    public void setRawNews(String str) 
    {  
      rawnews=str;  
    }  
    public void setHeading(String h) 
    {  
      heading=h;  
    } 
    public void setFullnews(String f) 
    {  
      fullnews=f;  
    } 

    @Override
    public String toString() {
        return "News{" + "heading=" + heading + ", fullnews=" + fullnews + ", rawnews=" + rawnews + '}';
    }

    
    
    
}
