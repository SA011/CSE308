package Bank.Accounts;

import Bank.Bank;

public class LoanAccount extends Account{
    LoanAccount(String name, double amount, Bank bank){
        this.name = name;
        this.balance = 0;
        bank.fund -= amount;
        this.loan = amount;
        this.bank = bank;
        System.out.println("Loan account for " + name + " Created; initial loan " + String.format("%,.2f$", loan));
   
    }

    @Override
    public void deposite(double amount) {
        if(amount < 0 || amount > loan){
            unsuccessfulDeposit();
        }else{
            this.loan -= amount;
            this.bank.fund += amount;
            successfulDeposit(amount);
        }
    }

    @Override
    public void withdraw(double amount) {
        unsuccessfulWithdraw();
    }

    @Override
    public void requestLoan(double amount) {
        if(this.loan * 0.05 < amount || amount < 0){
            unsuccessfulLoanRequest();
        }else{
            bank.loanPending.add(this);
            bank.amount.add(amount);
            successfulLoanRequest();
        }
    }

    @Override
    public void incYear() {
        balance -= loan * 0.1;
        if(balance < 0){
            loan += -balance;
            balance = 0;
        }
    }

}
