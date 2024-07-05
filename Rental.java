/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework;

public class Rental {
    // Two public final static fields that hold the number of minutes in an hour and the hourly rental rate ($40)
    public final static int MINUTES_IN_HOUR = 60;
    public final static double HOURLY_RATE = 40.0;

    // Four private fields that hold a contract number, number of hours for the rental, number of minutes over an hour, and the price
    private String contractNumber;
    private int hours;
    private int extraMinutes;
    private double price;

    // Two public set methods
    // One sets the contract number
    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }
    public void motto(){
        System.out.println("");
        System.out.println("***************************************************");
        System.out.println("* We always bring memories to your summer outings *");
        System.out.println("***************************************************");
        System.out.println("");
    }

    // The other sets the hours and minutes, and calculates the price
    public void setHoursAndMinutes(int minutes) {
        // Divide the minutes by 60 to get the hours
        hours = minutes / MINUTES_IN_HOUR;
        // Get the remainder of the minutes after dividing by 60 to get the extra minutes
        extraMinutes = minutes % MINUTES_IN_HOUR;
        // Calculate the price as R40 per hour plus $1 per extra minute
        price = HOURLY_RATE * hours + extraMinutes;
    }

    // Four public get methods that return the values in the four nonstatic fields
    public String getContractNumber() {
        return contractNumber;
    }

    public int getHours() {
        return hours;
    }

    public int getExtraMinutes() {
        return extraMinutes;
    }

    public double getPrice() {
        return price;
    }
}
