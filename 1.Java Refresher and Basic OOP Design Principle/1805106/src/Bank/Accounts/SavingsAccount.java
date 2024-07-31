package Bank.Accounts;

import Bank.Bank;

public class SavingsAccount extends Account{
    static double interest = 0.1;
    SavingsAccount(String name, double amount, Bank bank){
        this.name = name;
        this.balance = amount;
        bank.fund += amount;
        this.loan = 0;
        this.bank = bank;
        System.out.println("Savings account for " + name + " Created; initial balance " + String.format("%,.2f$", balance));
    }

    @Override
    public void deposite(double amount) {
        if(amount < 0){
            unsuccessfulDeposit();
        }else{
            this.bank.fund += amount;
            this.balance += amount;
            successfulDeposit(amount);
        }
    }

    @Override
    public void withdraw(double amount) {
        if(this.balance < amount + 1000 || amount < 0){
            unsuccessfulWithdraw();
        }else{
            this.bank.fund -= amount;
            this.balance -= amount;
            successfulWithdraw(amount);
        }
    }

    @Override
    public void requestLoan(double amount) {
        if(this.loan + amount > 10_000 || amount < 0){
            unsuccessfulLoanRequest();
        }else{
            this.bank.loanPending.add(this);
            this.bank.amount.add(amount);
            successfulLoanRequest();
        }
    }

    @Override
    public void incYear() {
        balance += balance * interest;
        balance -= loan * 0.1;
        balance -= 500;
        if(balance < 0){
            loan += -balance;
            balance = 0;
        }
    }

}
