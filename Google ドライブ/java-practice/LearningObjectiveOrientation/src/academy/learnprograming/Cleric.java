package academy.learnprograming;

import java.util.Random;

public class Cleric {
    String name;
    private int hp;
    private int maxHp;
    private int mp;
    private int maxMp;

    Cleric() {
        this.hp = 50;
        this.maxHp = 50;
        this.mp = 10;
        this.maxMp = 10;
    }
    Cleric(String name) {
        this();
        this.name = name;
    }
    void selfAid() {
        this.hp = maxHp;
    }
    void pray(int section) {
        Random random = new Random();
        int recovery = section + random.nextInt(2);
        this.mp += recovery;
        System.out.println("聖職者" + name + "は祈った！MPを" + recovery + "回復した!");
        System.out.println(mp);
    }

    public int getHp() {
        return this.hp;
    }
    public int getMaxHp() {
        return this.maxHp;
    }
    public int getMp() {
        return this.mp;
    }
    public int getMaxMp() {
        return this.maxMp;
    }
}
