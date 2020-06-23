package academy.learnprograming;

public class Hero {
    private String name;
    private String job;
    private int gold;

    public Hero(String name, String job, int gold) {
        this.name = name;
        this.job = job;
        this.gold = gold;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    public int getGold() {
        return gold;
    }
}
