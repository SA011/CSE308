package Bank.Employees;

import Bank.Bank;
import Bank.Accounts.Account;

public abstract class Employee {
    protected String name;
    protected Bank bank;

    public static Employee createEmployee(String name, String type, Bank bank){
        if(type.equalsIgnoreCase("Officer"))
            return new Officer(name, bank);
        if(type.equalsIgnoreCase("Managing Director"))
            return new ManagingDirector(name, bank);
        if(type.equalsIgnoreCase("Cashier"))
            return new Cashier(name, bank);
        return null;
    }
    public void lookup(String name){
        Account temp = (Account)bank.allAccounts.get(name);
        if(temp == null){
            System.out.println("Account with name " + name + " doesn't exist.");
        }else{
            System.out.println(name + "'s current balance " + String.format("%,.2f$", temp.getBalance()));
        }
    }

    public void approveLoan(){
        System.out.println("You don't have permission for this operation");
    }

    public void changeInterest(String type, double interest){
        System.out.println("You don't have permission for this operation");
    }

    
    public void seeFund(){
        System.out.println("You don't have permission for this operation");
    }
    public void close() {
        System.out.println("Operations for " + name + " closed");
    }
    public void open() {
        System.out.println(name + " active.");
    }


}
