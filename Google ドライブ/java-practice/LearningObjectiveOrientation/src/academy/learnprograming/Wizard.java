package academy.learnprograming;

public class Wizard {
    String name;
    int hp;
    void heal(Hero h){
        int heroHp = h.getHp();
        heroHp += 10;
        System.out.println(h.name + "のHPを10回復した！");
    }
}
