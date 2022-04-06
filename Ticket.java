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
public class Ticket {
    
    private String status; //booking or canceling tickets   
    private int noOfPerson ;
    private  String chargeType ;  // i-ticket or e-ticket 
    private Float fareamount =0f ;
    private Float priceofticket4oneperson ;
    int degreeofticket  ;

    public Ticket(String status, int noOfPerson, String chargeType, int degreeofticket) {
        this.status = status;
        this.noOfPerson = noOfPerson;
        this.chargeType = chargeType;
        this.degreeofticket = degreeofticket;
    }
   
      
    public Float FareAmount (int degreeofticket ,int noOfPerson)
    {
 
     if ( degreeofticket == 1)
    {
    System.out.println("price of ticket for one person=100 L.E");
    fareamount =  noOfPerson * 100f;
    }
    else  if (degreeofticket == 2)
    {
    
    System.out.println("price of ticket for one person=50 L.E");
    fareamount =  noOfPerson *50f;
    
    }
    else  if (degreeofticket == 3)
    {
    
    System.out.println("price of ticket for one person=25L.E");
    fareamount =  noOfPerson *25f;
    
    }
    else 
    {
        System.out.println("please enter vaild degree ");
    
    }
        
        
    return fareamount ;
    
    }
    private int i ;
    
public void newTicket (){
    
     
    System.out.println("Wlecome our passenger /n if you wanna to book a ticket click 1");
    Scanner sc = new Scanner (System.in);
    i = sc.nextInt();
    switch (i) {
    
        case 1 :
            System.out.println("now you booked a ticket ");
            break;
        default :
            System.out.println("please enter no 1 to book a ticket ");
            break;
   
    }

  
}

private int j; 
    public void deleteTicket (){
    
    System.out.println("We are happy to deal with you  /n if you wanna to delete the ticket click 2");
    Scanner sc = new Scanner (System.in);
    j = sc.nextInt();
    switch (j) {
    
        case 2 :
            System.out.println("now you delete the ticket ");
            break;
        default :
            System.out.println("please enter no 2 to cancel the booing of the ticket ");
            break;
   
    }
 
    }
  

    public String Status(String status) {
       
        
        switch ( status) {
            case "booking" : 
                System.out.println("you booked a ticket successfully  " );
                
                break;
            case "canceling": 
                System.out.println("you canceled the ticket successfully");
                break;
            default :
                System.out.println("Sorry yor entered a invaild status , please enter a valid status");
     }
     return status;
    }
 

    public void setChargeType() {
        System.out.println("please enter the charge type 'i-booking or e-booking tickets' ");
         Scanner sc = new Scanner (System.in);
       chargeType = sc.next();
        
        switch(chargeType){
            case "i-booking ":
                System.out.println("in this charge you can book ticket and we will send it to your address by post");
                break;
            case " e-booking ":
                System.out.println("in this case you can booking ao canceling ticket online and print it in your home ");
                break;
            default :
                System.out.println("please enter one of two csese 'i-booing or e-booking' to choose the charge type");
        
        
        }
    }

    
    void add(ArrayList<Ticket> ticket) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
}
