package academy.learnprograming;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Customer {
//    String name;
//    ArrayList<Double> transactionArrayList = new ArrayList<Double>();
//
//    public Customer(String name) {
//        this.name = name;
//    }
//
//    public static Customer createCustomer(String name, ArrayList<Double> transactionArrayList) {
//        return new Customer(name);
//    }
//
//    public void add(Double transaction) {
//        transactionArrayList.add(transaction);
//    }
//    ★ Coding example
    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name, double initialAmmount) {
        this.name = name;
        this.transactions = new ArrayList<Double>();
        addTransaction(initialAmmount);
    }

    public void addTransaction(double amount) {
        this.transactions.add(amount);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }
}
