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
public class LoanAccount {
    //annualInterestRate is the interest rate, constant across accounts, but can be set. principle is the initial payment
    private double annualInterestRate = 0;
    private double principle = 0; 
    private int months = 0;
    
    // The three getters
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public double getPrinciple() {
        return principle;
    }

    public int getMonths() {
        return months;
    }
   
   public void setAnnualInterestRate(double newRate)
   {
       annualInterestRate = newRate;
   }
   //Method for calculating the monthly payment amount, requires you to specify the time (in months) since the loan was created as an argument. Will return the monthly payment amount for specified time. 
   public double calculateMonthlyPayment() {
        //AnnualInterestRate is given out of 100, so any operations needs to divide it by 100 to get it into decimal form.
        double monthlyInterestRate = this.getAnnualInterestRate()/(12*100);
        double monthlyPayment = this.getPrinciple() * (monthlyInterestRate/(1-Math.pow(1+monthlyInterestRate,-this.getMonths())));
        return monthlyPayment;
   }
   public String toString() {
       String loanInfo = String.format("Principle: $%.2f%nAnnual Interest Rate: %.2f%%%nTerm of Loan in Months: %d%nMonthly Payment: $%.2f", this.getPrinciple(), this.getAnnualInterestRate(), this.getMonths(), this.calculateMonthlyPayment());
       return loanInfo;
   }
   //LoanAccounts must be initialized with a principle amount
   public LoanAccount(double principle, double annualInterestRate, int months) {
       this.principle = principle;
       this.annualInterestRate = annualInterestRate;
       this.months = months;
   } 
}


