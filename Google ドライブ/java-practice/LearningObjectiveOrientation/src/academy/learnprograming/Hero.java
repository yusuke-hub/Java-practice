package academy.learnprograming;

public class Hero {
    private int hp;
    String name;
    Sword sword;
    static int money;

    Hero() {
        this.hp = 100;
    }
    void bye(){
        System.out.println("勇者は別れを告げた");
    }

    // ★メンバに関するアクセス修飾子の定石
    // ・フィールドは全てprivate
    // ・メソッドは全てpublic

    // private
    // 外部のクラスから呼び出せなくなる
    private void die(){
        System.out.println(this.name + "は死んでしまった!");
        System.out.println("GAME OVERです。");
    }
    // アクセス修飾子をつける場合、package privateを指定したとみなされ
    // 同じパッケージに属するクラスからの呼び出しのみ可能になる
    void sleep(){
        this.hp += 100;
        System.out.println(this.name + "は眠って回復した！");
    }
    // public
    // どのクラスからでも呼び出せる
    public void attack(Matango m){
        System.out.println(this.name + "の攻撃!");
        System.out.println("お化けキノコ" + m.suffix + "から2ポイントの反撃を受けた");
        this.hp -= 2;
        if(this.hp <= 0){
            this.die();
        }
    }

    // getter / setter
    // 1,Read Only、Write Onlyのフィールドを実現できる 2,  フィールド名など、クラスの内部設計を自由に変更できる
    public String getName() {
        return this.name;
    }

    // setterメソッドの中で値の妥当性をチェックする
    // IllegalArgumentException
    // エラーを出してプログラムが強制停止する命令

    // ★カプセルかを支えている考え方
    // 外部から直接触られないよう、メソッドという殻によってフィールドが保護されているように見えることから
    // メソッドの処理内容は、プログラミング段階で決定し、一度コンパイルされればプログラム実行中に変化する事はない
    // しかしフィールド値はプログラム動作中に変化するため、動作中に以上な値になる危険性もある
    // 故にメソッドよりもフィールドを保護する事が重要

    // ★バグ(不具合)
    // 現実世界と仮想世界が食い違う事
    public void setName(String name) {
        if(name == null) {
            throw new IllegalArgumentException("名前がnullである。処理を中断。");
        }
        if(name.length() <= 1) {
            throw new IllegalArgumentException("名前が短すぎる。処理を中断。");
        }
        if(name.length() >= 8) {
            throw new IllegalArgumentException("名前が長すぎる。処理を中断。");
        }
        this.name = name;
    }
    public void setHp(int hp) {
        this.hp = hp;
    }
    public int getHp() {
        return this.hp;
    }
}
