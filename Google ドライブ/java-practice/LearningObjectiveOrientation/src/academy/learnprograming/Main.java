package academy.learnprograming;

public class Main {

    public static void main(String[] args) {
        Hero h1 = new Hero();
        Inn i = new Inn();
        System.out.println(h1.getHp());
        Cleric yusuke = new Cleric("Yusuke");
        System.out.println(yusuke.getHp());
        System.out.println(yusuke.getMaxHp());
        System.out.println(yusuke.getMp());
        System.out.println(yusuke.getMaxMp());
        yusuke.pray(3);
        System.out.println(yusuke.getMp());
    }
}
