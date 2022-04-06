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
public class Passenger {
    
    private String passname ;
    private String passaddress ;
    private String passgender ;
    private ArrayList <Ticket> ticket ;
    private ArrayList <Payment> payment ;
    
    private Train searchtrain;

    public Passenger( ) {
        ticket= new ArrayList <Ticket>();
        payment= new ArrayList <Payment >();
        
       
    }
    
    public Train searchTrain ( Train searchtrain){
    
    return searchtrain;
    
    }
    
    public void bookTicket( Ticket ticket)
    {
        System.out.println("you are booking a ticket " + ticket );
    }
  
    
    public void cancelTicket (Ticket ticket){
     
       
        System.out.println("You canceled the ticket"+ ticket);
    
    }
    
    public void payCharges (Payment payment){
    
   
     System.out.println("paycharges =" + payment.getBalance());
    
    }

    void add(ArrayList<Passenger> passenger) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    
    
}
