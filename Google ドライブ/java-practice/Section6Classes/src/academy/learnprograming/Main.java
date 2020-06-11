package academy.learnprograming;

public class Main {

    public static void main(String[] args) {
	    Car porsche = new Car();
	    Car holden = new Car();
        porsche.setModel("porche");
        holden.setModel("holden");
//        porsche.setModel("prius");
        System.out.println("Model is " + porsche.getModel());
        System.out.println("Model is " + holden.getModel());
    }
}
