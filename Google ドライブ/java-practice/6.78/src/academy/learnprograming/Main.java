package academy.learnprograming;

public class Main {

    public static void main(String[] args) {

	    BankAccount bobsAccount = new BankAccount("12345", 0.00, "Bob Brown", "myemail@bob.com", "(007)123-4567");
	    BankAccount mikesAccount = new BankAccount();
        System.out.println(mikesAccount.getNumber());
        System.out.println(mikesAccount.getBalance());
        System.out.println(bobsAccount.getNumber());
        System.out.println(bobsAccount.getBalance());
        bobsAccount.withdrawal(100.0);
        bobsAccount.withdrawal(50.0);

        bobsAccount.deposit(51.0);
        bobsAccount.withdrawal(100.0);

    }
}
