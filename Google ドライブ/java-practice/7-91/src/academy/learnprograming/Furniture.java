package academy.learnprograming;

public class Furniture extends BasicNecessities {
    private String name;
    private int number;

    public Furniture(String name, int number) {
        System.out.println("生活必需品クラスのサブクラス、家具クラスを初期化します");
        this.name = name;
        this.number = number;
        System.out.println("家具クラスの初期化が完了しました");
    }
}
