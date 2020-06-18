package academy.learnprograming;

public class Main {

    public static void main(String[] args) {
	    Printer printer = new Printer(50, 3, false);
	    printer.fillUp(10);
        printer.simulate(2, true);
        System.out.println(printer.getNumberOfPages());
        System.out.println(printer.isDuplex());
    }
}
