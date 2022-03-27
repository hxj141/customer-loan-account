/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customerloanaccount;

/**
 *
 * @author thonkpad
 */
public class CarLoan extends LoanAccount {
    private String vehicleVIN; 

    public String getVehicleVIN() {
        return vehicleVIN;
    }
    
    public CarLoan(double principle, double annualInterestRate, int months, String vehicleVIN) {
        super(principle, annualInterestRate, months);
        this.vehicleVIN = vehicleVIN;
        
    }
    public String toString() {
       String loanInfo = String.format("Car Loan with:%n%s%nVehicle VIN: %s%n%n", super.toString(), this.getVehicleVIN());
       return loanInfo;
   }
}
