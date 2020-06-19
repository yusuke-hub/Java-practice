package academy.learnprograming;

public class DeluxeBurger extends Humburger {
    private boolean chips;
    private boolean drink;

    public DeluxeBurger(String name, String breadRollType, boolean chips, boolean drink) {
        super("デラックスハンバーガーセット", "小麦");
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void add(boolean meat, boolean tomato, boolean lettuce, boolean carrot, boolean onion) {
        System.out.println("セットにトッピングできません");
    }
}
