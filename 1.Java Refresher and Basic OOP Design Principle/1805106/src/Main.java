import java.io.File;
import java.util.Scanner;

import Bank.Bank;

public class Main {
    public static void main(String[] args) throws Exception {
        Bank bank = new Bank();
        Scanner sc = new Scanner(new File("in.txt"));
        while(sc.hasNext()){
            String s = sc.next();
            if(s.equalsIgnoreCase("Create")){
                String name, type;
                name = sc.next();
                type = sc.next();
                Double amount = sc.nextDouble();
                bank.createAccount(name, type, amount);
            }else if(s.equalsIgnoreCase("Deposit")){
                Double amount = sc.nextDouble();
                bank.deposit(amount);
            }else if(s.equalsIgnoreCase("withdraw")){
                Double amount = sc.nextDouble();
                bank.withdraw(amount);
            }else if(s.equalsIgnoreCase("request")){
                Double amount = sc.nextDouble();
                bank.requestLoan(amount);
            }else if(s.equalsIgnoreCase("Query")){
                bank.queryDeposit();
            }else if(s.equalsIgnoreCase("Close")){
                bank.close();
            }else if(s.equalsIgnoreCase("open")){
                String name = sc.next();
                bank.open(name);
            }else if(s.equalsIgnoreCase("inc")){
                bank.incYear();
            }else if(s.equalsIgnoreCase("approve") && sc.next().equalsIgnoreCase("loan")){
                bank.approveLoan();
            }else if(s.equalsIgnoreCase("lookup")){
                bank.lookup(sc.next());
            }else if(s.equalsIgnoreCase("see")){
                bank.seeFund();
            }else if(s.equalsIgnoreCase("change")){
                bank.changeInterest(sc.next(), sc.nextDouble());
            }else{
                System.out.println("Invalid Operation");
            }
        }
    }
}
