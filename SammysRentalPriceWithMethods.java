/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework;
import java.util.Scanner;
/**
 *
 * @author Motlo
 */
public class SammysRentalPriceWithMethods {

  
    
    public static void main(String[] args) {
        // TODO code application logic here
        Rental c = new Rental();
        Scanner minutes = new Scanner(System.in);
      System.out.println("Please Enter Rental Duration in minutes");
       int v = minutes.nextInt();
      c.setHoursAndMinutes(v);
      System.out.println("Input contract number: ");
      String h = minutes.next();
      c.setContractNumber(h);
      c.motto();
      System.out.println("Contract Number: "+c.getContractNumber());
      System.out.println("Hours: "+c.getHours());
      System.out.println("Extra Minutes: "+c.getExtraMinutes());
      System.out.println("Price: R"+c.getPrice());
      
        
    }
    
}
