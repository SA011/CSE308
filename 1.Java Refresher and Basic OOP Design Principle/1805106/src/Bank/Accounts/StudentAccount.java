package Bank.Accounts;

import Bank.Bank;

public class StudentAccount extends Account{
    static double interest = 0.05;
    StudentAccount(String name, double amount, Bank bank){
        this.name = name;
        this.balance = amount;
        bank.fund += amount;
        this.loan = 0;
        this.bank = bank;
        System.out.println("Student account for " + name + " Created; initial balance " + String.format("%,.2f$", balance));
   
    }

    @Override
    public void deposite(double amount) {
        if(amount < 0){
            unsuccessfulDeposit();
        }else{
            this.balance += amount;
            this.bank.fund += amount;
            successfulDeposit(amount);
        }
    }

    @Override
    public void withdraw(double amount) {
        if(this.balance < amount || amount < 0 || amount > 10_000){
            unsuccessfulWithdraw();
        }else{
            this.balance -= amount;
            this.bank.fund -= amount;
            successfulWithdraw(amount);
        }
    }

    @Override
    public void requestLoan(double amount) {
        if(this.loan + amount > 1_000 || amount < 0){
            unsuccessfulLoanRequest();
        }else{
            bank.loanPending.add(this);
            bank.amount.add(amount);
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
