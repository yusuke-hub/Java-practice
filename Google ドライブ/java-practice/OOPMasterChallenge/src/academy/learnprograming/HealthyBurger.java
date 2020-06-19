package academy.learnprograming;

public class HealthyBurger extends Humburger {


    public HealthyBurger() {
        super( "ヘルシーハンバーガー", "ライ麦");
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void add(boolean meat, boolean tomato, boolean lettuce, boolean carrot, boolean onion) {
        if(meat && tomato && lettuce && carrot && onion) {
            setMeat(meat);
            setTomato(tomato);
            setLettuce(lettuce);
            setCarrot(carrot);
            setOnion(onion);
            System.out.println(this.getAdditions());
            System.out.println("このハンバーガーは、" + this.getPrice() + "円です");
        }

    }
}
