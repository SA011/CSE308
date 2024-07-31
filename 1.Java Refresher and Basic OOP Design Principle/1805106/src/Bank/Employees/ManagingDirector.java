package Bank.Employees;

import Bank.Bank;
import Bank.Accounts.Account;

public class ManagingDirector extends Employee{
    ManagingDirector(String name, Bank bank){
        this.name = name;
        this.bank = bank;
    }

    @Override
    public void approveLoan(){
        for(int i = 0; i < bank.loanPending.size(); i++){
            bank.loanPending.get(i).approveLoan(bank.amount.get(i));
        }
        bank.loanPending.clear();
        bank.amount.clear();
    }

    @Override
    public void seeFund(){
        System.out.println("Current internal funding is " + String.format("%,.2f", bank.fund));
    }

    @Override
    public void changeInterest(String type, double interest){
        Account.changeInterest(type, interest);
    }

    @Override
    public void open() {
        System.out.print(name + " active. ");
        if(!bank.loanPending.isEmpty()){
            System.out.println("There are loan approvals pending.");
        }else
            System.out.println();
    }
}
