package academy.learnprograming;

import javax.xml.stream.StreamFilter;

public class HealthyBurger extends Humburger {
    private String healthyExtra1Name;
    private double healthyExtra1Price;

    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String meat, double price) {
        super("Healthy", meat, price, "Brown rye");
    }

    public void addHealthyAddition1(String name, double price) {
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
    }

    public void addHealthyAddition2(String name, double price) {
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }

    @Override
    public double itemizeHamburger() {
        double hamburgerPrice = super.itemizeHamburger();
        if(this.healthyExtra1Name != null) {
            hamburgerPrice += this.healthyExtra1Price;
            System.out.println("Added " + this.healthyExtra1Name + " for an extra " + this.healthyExtra1Price);
        }
        if(this.healthyExtra2Name != null) {
            hamburgerPrice += this.healthyExtra2Price;
                System.out.println("Added " + this.healthyExtra2Name + " for an extra " + this.healthyExtra2Price);
        }

        return hamburgerPrice;
    }

//    ★ My Solution
//    public HealthyBurger() {
//        super( "ヘルシーハンバーガー", "ライ麦");
//    }
//
//    @Override
//    public void setName(String name) {
//        super.setName(name);
//    }
//
//    @Override
//    public void add(boolean meat, boolean tomato, boolean lettuce, boolean carrot, boolean onion) {
//        if(meat && tomato && lettuce && carrot && onion) {
//            setMeat(meat);
//            setTomato(tomato);
//            setLettuce(lettuce);
//            setCarrot(carrot);
//            setOnion(onion);
//            System.out.println(this.getAdditions());
//            System.out.println("このハンバーガーは、" + this.getPrice() + "円です");
//        }
//
//    }
}
