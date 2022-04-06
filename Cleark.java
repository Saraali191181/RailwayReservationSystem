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
public class Cleark {
    
    private String clearkName ;
    private String clearkID;
   private  ArrayList <Ticket> ticket ;

    public String getClearkName() {
        return clearkName;
    }

    public void setClearkName(String clearkName) {
        this.clearkName = clearkName;
    }

    public String getClearkID() {
        return clearkID;
    }

    public void setClearkID(String clearkID) {
        this.clearkID = clearkID;
    }
 
   
    public Ticket formdetail ( Ticket arr){
    
        arr.add(ticket);
        
   return arr;
  
    }
   public Ticket cancelationForm (Ticket arr1) 
   {
   
   arr1.add(ticket);
    System.out.println("you are canceld the ticket");
   return arr1;
   
   }

    @Override
    public String toString() {
        return "Cleark{" + "clearkName=" + clearkName + ", clearkID=" + clearkID + ", ticket=" + ticket.toString() + '}';
    }

    
   
}


