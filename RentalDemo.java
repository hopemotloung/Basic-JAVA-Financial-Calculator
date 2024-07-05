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
public class RentalDemo {

  
    public static void min(double c){
       
        System.out.println("Your input is "+c+" Minutes.");
    }
    
    public static void motto(){
        System.out.println("");
        System.out.println("***************************************************");
        System.out.println("* We always bring memories to your summer outings *");
        System.out.println("***************************************************");
        System.out.println("");
    }
    
    public static void total(double c){
        double b = c / 60;
        System.out.println("Hours: "+b);
        double e = c * 2;
        System.out.println("Payment due: "+"R"+e);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
      Scanner a = new Scanner(System.in);
      System.out.println("Please Enter Rental Time in minutes");
      double c = a.nextDouble();
      
        min(c);
        motto();
        total(c);
    }
    
}
