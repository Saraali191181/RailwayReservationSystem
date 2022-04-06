/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package railwayreservation;

/**
 *
 * @author hp
 */
public class RailwayReservation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       
        Ticket t1 = new Ticket ("booking" ,2,"i-ticket",2);
        Ticket t2 = new Ticket ("booking" ,2,"i-ticket",1);
        Ticket t3 = new Ticket ("booking" ,2,"i-ticket",3);
        Ticket t4 = new Ticket ("booking" ,3,"i-ticket",1);
      
        Payment p =new Payment ();
        
        Passenger passenger1 = new Passenger ();
        Passenger passenger2 = new Passenger ();
        Passenger passenger3 = new Passenger ();
        Passenger passenger4 = new Passenger ();
            

        passenger1.bookTicket(t1);
        t1.FareAmount(2,2);
        t1.Status("booking");
        System.out.println();
        System.out.println("********************************************************");
        passenger2.bookTicket(t2);
        t2.FareAmount(1,2);
        t2.Status("booking");
        System.out.println("********************************************************");
        System.out.println();

        passenger3.bookTicket(t1);
        t3.FareAmount(3,2);
        t3.Status("booking");
        System.out.println();
        System.out.println("********************************************************");

        passenger4.cancelTicket(t4);
        t4.FareAmount(1,3);
        t4.Status("canceling");
        
       
        
    }
    
}
