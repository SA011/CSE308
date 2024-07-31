package Bank.Accounts;

import Bank.Bank;

abstract public class Account {
    protected String name;
    protected double balance, loan;
    protected Bank bank;
    protected void unsuccessfulDeposit(){
        System.out.println(String.format("Invalid transaction; current balance %,.2f$", balance));
    }
    protected void successfulDeposit(double amount){
        System.out.println(String.format("%,.2f$ deposited; current balance %,.2f$", amount, balance));
    }

    protected void unsuccessfulWithdraw(){
        System.out.println(String.format("Invalid transaction; current balance %,.2f$", balance));
    }
    protected void successfulWithdraw(double amount){
        System.out.println(String.format("%,.2f$ withdrawn; current balance %.2f$", amount, balance));
    }

    protected void unsuccessfulLoanRequest(){
        System.out.println(String.format("Invalid request; current loan %,.2f$", loan));
    }
    protected void successfulLoanRequest(){
        System.out.println("Loan request successful, sent for approval");
    }
    public static Account createAccount(String name, String type, double amount, Bank bank){
        if(type == null){
            System.out.println("Unable to create the account");
            return null;
        }
        if(type.equalsIgnoreCase("Savings"))
            return new FixedDepositAccount(name, amount, bank);
        if(type.equalsIgnoreCase("Student"))
            return new StudentAccount(name, amount, bank);
        if(type.equalsIgnoreCase("Fixed Deposit") && amount > 100_000)
            return new FixedDepositAccount(name, amount, bank);
        if(type.equalsIgnoreCase("Loan"))
            return new LoanAccount(name, amount, bank);
        System.out.println("Unable to create the account");
        return null;
    }
    public abstract void deposite(double amount);
    public abstract void withdraw(double amount);
    public abstract void requestLoan(double amount);
    public void queryDeposit(){
        System.out.println("Current Balance " + String.format("%,.2f", balance) + "$" +
            (loan > 0 ? ", loan " + String.format("%,.2f", loan) + "$" : ""));
    }
    public abstract void incYear();
    public double getBalance() {
        return balance;
    }
    public static void changeInterest(String type, double interest) {
        if(type.equalsIgnoreCase("Savings"))
            SavingsAccount.interest = interest;
        if(type.equalsIgnoreCase("Student"))
            StudentAccount.interest = interest;
        if(type.equalsIgnoreCase("Fixed Deposit"))
            FixedDepositAccount.interest = interest;
    }
    public void approveLoan(Double amount) {
        loan += amount;
        balance += amount;
        System.out.println("Loan approved for " + name);
    }
    public void close() {
        System.out.println("Transaction Closed for " + name);
    }
    public void open() {
        System.out.println("Welcome back, " + name);
    }
}