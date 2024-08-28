package org.example;


import java.math.BigDecimal;
import java.util.Random;
import java.util.Set;

public class BankService {
    private Set<Account> accounts;

    public String openAccount(Client client){
        //generate a random account number
            Random random = new Random();
            int randomNumber = random.nextInt(900) + 100; // Generates a number between 100 and 999
            String randomString = String.valueOf(randomNumber);
            System.out.println(randomString);

            //create a new account
            Account newAccount = new Account(randomString, BigDecimal.valueOf(0), client);

            //add new account to Set
        //accounts.add(newAccount);

            return randomString;

    }
}
