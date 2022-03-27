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
public class PrimaryMortgage extends LoanAccount {
    double PMIMonthlyAmount = 0;
    //Look into whether Address can be named Address
    Address Address;
    public PrimaryMortgage(double principle, double annualInterestRate, int months, double PMIMonthlyAmount, Address Address) {
        super(principle, annualInterestRate, months);
        this.PMIMonthlyAmount = PMIMonthlyAmount;
        this.Address = Address;
    }

    public double getPMIMonthlyAmount() {
        return PMIMonthlyAmount;
    }
    
    public String toString() {
       String loanInfo = String.format("Primary Mortgage Loan with: %n%s%nPMI Monthly Amount: $%s%n%s%n", super.toString(), this.getPMIMonthlyAmount(), this.Address.toString());
       return loanInfo;
   }
}
