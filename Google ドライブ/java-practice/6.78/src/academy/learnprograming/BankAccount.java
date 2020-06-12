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
    private int accountNumber;
    private int balance;
    private String customerName;
    private String email;
    private int phoneNumber;

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public int getAccountNumber() {
        return accountNumber;
    }
    public int getBalance() {
        return balance;
    }
    public String getCustomerName() {
        return customerName;
    }
    public String getEmail() {
        return email;
    }
    public int getPhoneNumber() {
        return phoneNumber;
    }
    public void deposit(int balance) {
        this.balance += balance;
        System.out.println(balance + "yen was deposited and the amount deposited was " + this.balance +  "yen.");
    }
    public void withdraw(int balance) {
        if(this.balance < balance) {
            System.out.println("Your balance is insufficient.");
        } else {
            this.balance -= balance;
            System.out.println(balance + "yen was withdrawn and the amount deposited was " + this.balance + "yen.");
        }
    }

}
