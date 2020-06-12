package academy.learnprograming;

public class Main {

    public static void main(String[] args) {
	    BankAccount bankAccount = new BankAccount();
	    bankAccount.setAccountNumber(12345);
	    bankAccount.setBalance(10000);
	    bankAccount.setCustomerName("Kawabata Yusuke");
	    bankAccount.setEmail("yk1210140408@gmail.com");
	    bankAccount.setPhoneNumber(123456789);
        System.out.println(bankAccount.getBalance());
        bankAccount.deposit(10000);
        System.out.println(bankAccount.getBalance());
        bankAccount.withdraw(5000);
        System.out.println(bankAccount.getBalance());

    }
}
