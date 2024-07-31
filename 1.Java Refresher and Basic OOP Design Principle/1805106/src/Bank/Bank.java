package Bank;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Bank.Accounts.Account;
import Bank.Employees.Employee;

public class Bank {
    public Map<String, Account> allAccounts;
    public Map<String, Employee> allEmployee;
    public List<Account> loanPending;
    public List<Double> amount;
    public double fund;
    private Account currentAccount;
    private Employee currentemployee;
    public int year;
    public Bank(){
        year = 0;
        allAccounts = new HashMap<>();
        allEmployee = new HashMap<>();
        loanPending = new ArrayList<>();
        amount = new ArrayList<>();
        fund = 100_000;
        currentAccount = null;
        currentemployee = null;
        allEmployee.put("MD", Employee.createEmployee("MD", "Managing Director", this));
        allEmployee.put("O1", Employee.createEmployee("O1", "Officer", this));
        allEmployee.put("O2", Employee.createEmployee("O2", "Officer", this));
        allEmployee.put("C1", Employee.createEmployee("C1", "Cashier", this));
        allEmployee.put("C2", Employee.createEmployee("C2", "Cashier", this));
        allEmployee.put("C3", Employee.createEmployee("C3", "Cashier", this));
        allEmployee.put("C4", Employee.createEmployee("C4", "Cashier", this));
        allEmployee.put("C5", Employee.createEmployee("C5", "Cashier", this));
        
    }

    public void createAccount(String name, String type, double amount){
        if(allAccounts.get("name") == null && allEmployee.get("name") == null){
            close();
            currentAccount = Account.createAccount(name, type, amount, this);
            if(currentAccount != null)
                allAccounts.put(name, currentAccount);
            else 
                System.out.println("Unable to create the account");
        
        }else{
            System.out.println("Invalid name.");
        }
    }

    public void deposit(double amount){
        if(currentAccount == null){
            System.out.println("Invalid Operation");
        }else{
            currentAccount.deposite(amount);
        }
    }

    public void withdraw(double amount){
        if(currentAccount == null){
            System.out.println("Invalid Operation");
        }else{
            currentAccount.withdraw(amount);
        }
    }

    public void requestLoan(double amount){
        if(currentAccount == null){
            System.out.println("Invalid Operation");
        }else{
            currentAccount.requestLoan(amount);
        }
    }

    public void queryDeposit(){
        if(currentAccount == null){
            System.out.println("Invalid Operation");
        }else{
            currentAccount.queryDeposit();
        }
    }

    public void lookup(String name){
        if(currentemployee == null){
            System.out.println("Invalid Operation");
        }else{
            currentemployee.lookup(name);
        }
    }

    public void approveLoan(){
        if(currentemployee == null){
            System.out.println("Invalid Operation");
        }else{
            currentemployee.approveLoan();
        }
    }

    public void changeInterest(String type, double interest){
        if(currentemployee == null){
            System.out.println("Invalid Operation");
        }else{
            currentemployee.changeInterest(type, interest);
        }
    }

    public void seeFund(){
        if(currentemployee == null){
            System.out.println("Invalid Operation");
        }else{
            currentemployee.seeFund();
        }
    }

    public void incYear(){
        year++;
        System.out.println("1 year passed");
        for(Map.Entry<String, Account> e : allAccounts.entrySet()){
            e.getValue().incYear();
        }
    }

    
    public void close(){
        if(currentAccount != null){
            currentAccount.close();
            currentAccount = null;
        }
        if(currentemployee != null){
            currentemployee.close();
            currentemployee = null;
        }
    }

    public void open(String name){
        close();
        currentAccount = allAccounts.get(name);
        if(currentAccount == null){
            currentemployee = allEmployee.get(name);
            if(currentemployee == null){
                System.out.println("Can not find the user");
                return;
            }
            currentemployee.open();
            return;
        }
        currentAccount.open();
    }

}
