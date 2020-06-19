package academy.learnprograming;

public class Humburger {
    private String name;
    private int price;
    private String breadRollType;
    private boolean meat;
    private boolean tomato;
    private boolean lettuce;
    private boolean carrot;
    private boolean onion;
    private String additions;

    public Humburger(String name, String breadRollType) {
        setName(name);
        setPrice(350);
        setBreadRollType(breadRollType);
        this.meat = false;
        this.tomato = false;
        this.lettuce = false;
        this.carrot = false;
        this.onion = false;
        this.additions = "トッピング:";
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setBreadRollType(String breadRollType) {
        this.breadRollType = breadRollType;
    }

    public void setMeat(boolean meat) {
        this.meat = meat;
        if(meat) {
            price += 200;
            additions += " 肉";
        }
    }

    public void setTomato(boolean tomato) {
        this.tomato = tomato;
        if(tomato){
            price += 100;
            additions += " トマト";
        }
    }

    public void setOnion(boolean onion) {
        this.onion = onion;
        if(onion) {
            price += 80;
            additions += " オニオン";
        }
    }

    public void setLettuce(boolean lettuce) {
        this.lettuce = lettuce;
        if(lettuce) {
            price += 60;
            additions += " レタス";
        }
    }

    public void setCarrot(boolean carrot) {
        this.carrot = carrot;
        if(carrot) price += 40;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public boolean isMeat() {
        return meat;
    }

    public boolean isTomato() {
        return tomato;
    }

    public boolean isLettuce() {
        return lettuce;
    }

    public boolean isCarrot() {
        return carrot;
    }

    public boolean isOnion() {
        return onion;
    }

    public String getAdditions() {
        return additions;
    }

    public void add(boolean meat, boolean tomato, boolean lettuce, boolean carrot, boolean onion) {
        if(meat && tomato && lettuce && carrot && onion) {
            System.out.println("トッピングは4種類までです");
        } else {
            setMeat(meat);
            setTomato(tomato);
            setLettuce(lettuce);
            setCarrot(carrot);
            setOnion(onion);
            System.out.println("このハンバーガーの価格は、" + price + "円です");
        }
    }

}
