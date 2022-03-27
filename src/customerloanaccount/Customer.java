/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customerloanaccount;
import java.util.ArrayList;

/**
 *
 * @author thonkpad
 */
public class Customer {
    private String firstName;
    private String lastName;
    private String SSN;
    private ArrayList<LoanAccount> LoanAccounts = new ArrayList<LoanAccount>();

    public Customer(String firstName, String lastName, String SSN) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.SSN = SSN;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSSN() {
        return SSN;
    }
    
    public void addLoanAccount(LoanAccount account) {
        this.LoanAccounts.add(account);
    }
    
       public String printMonthlyReport() {
       String customerInfo = String.format("Account Report for Customer: %s %s with SSN %s%n", this.firstName, this.lastName, this.SSN);
       String loanInfo = "";
       for (int i = 0; i < this.LoanAccounts.size(); i++) {
            loanInfo = loanInfo + this.LoanAccounts.get(i).toString();
       }
       String combinedInfo = String.format("%s%n%s%n", customerInfo, loanInfo);
       return combinedInfo;
   }
}
