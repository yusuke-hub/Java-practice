package academy.learnprograming;

public class DeluxeBurger extends Humburger {

//    ★ Solution Example

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Can not add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Can not add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Can not add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Can not add additional items to a deluxe burger");
    }

    public DeluxeBurger() {
        super("Deluxe", "Sausage & Bacon", 14.54, "White");
        super.addHamburgerAddition1("Chips", 2.75);
        super.addHamburgerAddition2("Drink", 1.81);


    }


//    ★ My Solution
//    private boolean chips;
//    private boolean drink;
//
//    public DeluxeBurger(String name, String breadRollType, boolean chips, boolean drink) {
//        super("デラックスハンバーガーセット", "小麦");
//    }
//
//    @Override
//    public void setName(String name) {
//        super.setName(name);
//    }
//
//    @Override
//    public void add(boolean meat, boolean tomato, boolean lettuce, boolean carrot, boolean onion) {
//        System.out.println("セットにトッピングできません");
//    }
}
