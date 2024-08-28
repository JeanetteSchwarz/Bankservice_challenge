package org.example;

import java.math.BigDecimal;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        //create clients
        Client max = new Client("Max", "Mustermann", "1234");
        Client moritz = new Client("Moritz", "Mustermann", "5678");
        Client lisa = new Client("Lisa", "Simpson", "7890");
        Client bart = new Client("Bart", "Simpson", "2345");

        //create BigDecimals
        BigDecimal number1 = new BigDecimal("780.37");
        BigDecimal number2 = new BigDecimal("650.45");
        BigDecimal number3 = new BigDecimal("890.35");

        //create accounts for clients
        Account maxAccount = new Account("987", number1, max);
        Account moritzAccount = new Account("567", number2, moritz);
        Account lisasAccount = new Account("123", number3, lisa);

        //instantiate Bankservice = create an object springfieldbank on base of class Bankservice
        BankService springfieldbank = new BankService();

        System.out.println(maxAccount.deposit(number3));
        System.out.println(lisasAccount.withdraw(number3));

        //open a new account for client bart
        springfieldbank.openAccount(bart);

        //add moritz account to BankService
        springfieldbank.addAccount(moritzAccount);

        System.out.println(springfieldbank);
    }
}