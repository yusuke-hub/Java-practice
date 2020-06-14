// 銀行口座用の新規クラスを作成する
// 口座番号、残高、顧客名、電子メール、電話番号のフィールドを作成します。
//
// 各フィールドのゲッターとセッターを作成します。
// 2つのメソッドを追加で作成します。
// 1.顧客が資金を入金することを許可するには（これは残高フィールドを増分する必要があります）。
// 2.顧客が資金を引き出すことができるようにします。これは、バランスフィールドから控除する必要があります。
// しかし、資金が不足している場合には引き出しを完了させないようにします。
// Mainクラス（IntelliJによって作成されたもの）に様々なコードを作成したいと思うでしょう。
// コードが動作していることを確認してください。
// 上記の2つのメソッドにも同様にSystem.out.printlnを追加します。


package academy.learnprograming;

public class BankAccount {
//    ★ My Solution
//    private int accountNumber;
//    private int balance;
//    private String customerName;
//    private String email;
//    private String phoneNumber;
//
//    public void setAccountNumber(int accountNumber) {
//        this.accountNumber = accountNumber;
//    }
//    public void setBalance(int balance) {
//        this.balance = balance;
//    }
//    public void setCustomerName(String customerName) {
//        this.customerName = customerName;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//    public void setPhoneNumber(String phoneNumber) {
//        this.phoneNumber = phoneNumber;
//    }
//    public int getAccountNumber() {
//        return accountNumber;
//    }
//    public int getBalance() {
//        return balance;
//    }
//    public String getCustomerName() {
//        return customerName;
//    }
//    public String getEmail() {
//        return email;
//    }
//    public String getPhoneNumber() {
//        return phoneNumber;
//    }
//    public void deposit(int balance) {
//        this.balance += balance;
//        System.out.println(balance + "yen was deposited and the amount deposited was " + this.balance +  "yen.");
//    }
//    public void withdraw(int balance) {
//        if(this.balance < balance) {
//            System.out.println("Your balance is insssufficient.");
//        } else {
//            this.balance -= balance;
//            System.out.println(balance + "yen was withdrawn and the amount deposited was " + this.balance + "yen.");
//        }
//    }
//    ★ Solution Example


    private String number;
    private double balance;
    private String customerName;
    private String customerEmailAddress;
    private String customerPhoneNumber;

    public void setNumber(String number) {
        this.number = number;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }
    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }
    public String getNumber() {
        return number;
    }
    public double getBalance() {
        return balance;
    }
    public String getCustomerName() {
        return customerName;
    }
    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }
    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }
    public BankAccount() {
        this("56789", 2.50, "Default name", "Default address", "default phone");
        System.out.println("Empty constructor called");
    }

    public BankAccount(String number, double balance, String customerName, String customerEmailAddress, String customerPhoneNumber) {
        System.out.println("Account constructor with parameters called");
        setNumber(number);
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmailAddress = customerEmailAddress;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public BankAccount(String customerName, String customerEmailAddress, String customerPhoneNumber) {
        this.customerName = customerName;
        this.customerEmailAddress = customerEmailAddress;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public void deposit(double depositAmount) {
        this.balance += depositAmount;
        System.out.println("Deposit of " + depositAmount + " made. New balance is " + this.balance);
    }

    public void withdrawal(double withdrawalAmount) {
        if(this.balance - withdrawalAmount <=0) {
            System.out.println("Only" + this.balance + " available. Withdrawal not processed");
        } else {
            this.balance -= withdrawalAmount;
            System.out.println("Withdrawal of " + withdrawalAmount + " processed. Remaining balance = " + this.balance);
        }
    }

}
