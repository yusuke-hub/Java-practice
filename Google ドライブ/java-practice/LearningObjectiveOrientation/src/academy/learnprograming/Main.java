package academy.learnprograming;

public class Main {

    public static void main(String[] args) {
	    Hero h = new Hero();
	    h.name = "ミナト";
	    h.hp = 100;
        System.out.println("勇者" + h.name + "を生み出しました!");

        h.sit(5);
        System.out.println(h.hp);
        System.out.println("");

        h.slip();
        System.out.println(h.hp);
        System.out.println("");

        h.sit(25);
        System.out.println(h.hp);
        System.out.println("");

        h.run();
        System.out.println("");

        Matango m1 = new Matango();
        m1.hp = 50;
        m1.suffix = 'A';

        Matango m2 = new Matango();
        m2.hp = 48;
        m2.suffix = 'B';
        m1.run();
        m2.run();


    }
}
