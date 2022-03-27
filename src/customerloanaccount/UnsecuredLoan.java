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
public class UnsecuredLoan extends LoanAccount {
    
    public UnsecuredLoan(double principle, double annualInterestRate, int months) {
        super(principle, annualInterestRate, months);
    }
    public String toString() {
       String loanInfo = String.format("Unsecured Loan With: %n%s%n", super.toString());
       return loanInfo;
   }
    
}
