package academy.learnprograming;

public class Humburger {
//    ★ Solution Example
    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    private String addition1Name;
    private double addition1Price;

    private String addition2Name;
    private double addition2Price;

    private String addition3Name;
    private double addition3Price;

    private String addition4Name;
    private double addition4Price;

    public Humburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public void addHamburgerAddition1(String name, double price) {
        this.addition1Name = name;
        this.addition1Price = price;
    }

    public void addHamburgerAddition2(String name, double price) {
        this.addition2Name = name;
        this.addition2Price = price;
    }

    public void addHamburgerAddition3(String name, double price) {
        this.addition3Name = name;
        this.addition3Price = price;
    }

    public void addHamburgerAddition4(String name, double price) {
        this.addition4Name = name;
        this.addition4Price = price;
    }

    public double itemizeHamburger() {
        double humburgerPrice = this.price;
        System.out.println(this.name + " hamburger " + " on a " + this.breadRollType + " roll " + "price is " + this.price);
        if(this.addition1Name != null) {
            humburgerPrice += this.addition1Price;
            System.out.println("Added " + this.addition1Name + " for an extra " + this.addition1Price);
        }
        if(this.addition2Name != null) {
            humburgerPrice += this.addition2Price;
            System.out.println("Added " + this.addition2Name + " for an extra " + this.addition2Price);
        }
        if(this.addition3Name != null) {
            humburgerPrice += this.addition3Price;
            System.out.println("Added " + this.addition3Name + " for an extra " + this.addition3Price);
        }
        if(this.addition4Name != null) {
            humburgerPrice += this.addition4Price;
            System.out.println("Added " + this.addition4Name + " for an extra " + this.addition4Price);
        }

        return humburgerPrice;
    }

//    ★ My Solution
//    private String name;
//    private int price;
//    private String breadRollType;
//    private boolean meat;
//    private boolean tomato;
//    private boolean lettuce;
//    private boolean carrot;
//    private boolean onion;
//    private String additions;
//
//    public Humburger(String name, String breadRollType) {
//        setName(name);
//        setPrice(350);
//        setBreadRollType(breadRollType);
//        this.meat = false;
//        this.tomato = false;
//        this.lettuce = false;
//        this.carrot = false;
//        this.onion = false;
//        this.additions = "トッピング:";
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setPrice(int price) {
//        this.price = price;
//    }
//
//    public void setBreadRollType(String breadRollType) {
//        this.breadRollType = breadRollType;
//    }
//
//    public void setMeat(boolean meat) {
//        this.meat = meat;
//        if(meat) {
//            price += 200;
//            additions += " 肉";
//        }
//    }
//
//    public void setTomato(boolean tomato) {
//        this.tomato = tomato;
//        if(tomato){
//            price += 100;
//            additions += " トマト";
//        }
//    }
//
//    public void setOnion(boolean onion) {
//        this.onion = onion;
//        if(onion) {
//            price += 80;
//            additions += " オニオン";
//        }
//    }
//
//    public void setLettuce(boolean lettuce) {
//        this.lettuce = lettuce;
//        if(lettuce) {
//            price += 60;
//            additions += " レタス";
//        }
//    }
//
//    public void setCarrot(boolean carrot) {
//        this.carrot = carrot;
//        if(carrot) price += 40;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public int getPrice() {
//        return price;
//    }
//
//    public String getBreadRollType() {
//        return breadRollType;
//    }
//
//    public boolean isMeat() {
//        return meat;
//    }
//
//    public boolean isTomato() {
//        return tomato;
//    }
//
//    public boolean isLettuce() {
//        return lettuce;
//    }
//
//    public boolean isCarrot() {
//        return carrot;
//    }
//
//    public boolean isOnion() {
//        return onion;
//    }
//
//    public String getAdditions() {
//        return additions;
//    }
//
//    public void add(boolean meat, boolean tomato, boolean lettuce, boolean carrot, boolean onion) {
//        if(meat && tomato && lettuce && carrot && onion) {
//            System.out.println("トッピングは4種類までです");
//        } else {
//            setMeat(meat);
//            setTomato(tomato);
//            setLettuce(lettuce);
//            setCarrot(carrot);
//            setOnion(onion);
//            System.out.println("このハンバーガーの価格は、" + price + "円です");
//        }
//    }

}
