/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package railwayreservation;
import java.util.*;
/**
 *
 * @author hp
 */
public class RailwaySystem {
    
   private String systemID ;
   private  ArrayList <Cleark> cleark ;
   private  ArrayList <Passenger> passenger ;


    public RailwaySystem() {
        
        cleark = new ArrayList<Cleark>();
        passenger = new ArrayList<Passenger >() ; 
        
    }
  

    public String getSystemID() {
        return systemID;
    }

    public void setSystemID(String systemID) {
        this.systemID = systemID;
    }

    

    
    
    
}
