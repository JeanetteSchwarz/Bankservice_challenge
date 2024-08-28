package org.example;


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class BankService {
    private Set<Account> accounts  = new HashSet<>();

    public Set<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(Set<Account> accounts) {
        this.accounts = accounts;
    }

    @Override
    public String toString() {
        return "BankService{" +
                "accounts=" + accounts +
                '}';
    }

    public void addAccount(Account account){
        accounts.add(account);
        System.out.println("Account succesfully added.");
    }

    //method to create an new bank account
    public String openAccount(Client client){
        //generate a random account number
            Random random = new Random();
            int randomNumber = random.nextInt(900) + 100; // Generates a number between 100 and 999
            String randomString = String.valueOf(randomNumber);
            System.out.println(randomString);

            //create a new account
            Account newAccount = new Account(randomString, BigDecimal.valueOf(0), client);

            //add new account to Set
            accounts.add(newAccount);

            System.out.println(accounts);

            return randomString;
    }
}
