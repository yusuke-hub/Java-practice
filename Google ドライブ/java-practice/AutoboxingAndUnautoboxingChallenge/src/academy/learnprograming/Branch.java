package academy.learnprograming;

import java.util.ArrayList;

public class Branch {
//    String name;
//    private ArrayList<Customer> customerArrayList = new ArrayList<Customer>();
//
//    public Branch(String name) {
//        this.name = name;
//        this.customerArrayList = customerArrayList;
//    }
//
//    public void add(String name, Double transaction) {
//        Customer newCustomer = new Customer(name);
//        this.customerArrayList.add(newCustomer);
//        newCustomer.transactionArrayList.add(transaction);
//    }
//
//    public void extraAdd(Customer existingCustomer, Double transaction) {
//        for(int i=0; i<customerArrayList.size(); i++) {
//            if(customerArrayList.get(i).equals(existingCustomer)) {
//                existingCustomer.transactionArrayList.add(transaction);
//                for(int i2 = 0; i2 < existingCustomer.transactionArrayList.size(); i++) {
//                    System.out.println("顧客: " + existingCustomer.name);
//                    System.out.println("取引履歴");
//                    System.out.println(i2 + "回目: " + existingCustomer.transactionArrayList.get(i2) + "円");
//                }
//            }
//        }
//        System.out.println("指定された顧客は、支店" + this.name + "にはおりません");
//    }
    // ★ Coding example
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name, ArrayList<Customer> customers) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public boolean newCustomer(String customerName, double initialAmount) {
        if(findCustomer(customerName) == null) {
            this.customers.add(new Customer(customerName, initialAmount));
            return true;
        }

        return false;
    }

    public boolean addCustomerTransaction(String customerName, double amount) {
        if(findCustomer(customerName) != null) {
             Customer existingCustomer = findCustomer()()
        }
    }
}
