package academy.learnprograming;

public class Hero {
    String name;
    int hp;
    
    void sleep(){
        // 同じクラス内のフィールドへのアクセスの場合、「this.」を省略しても動作はする
        // しかし、ローカル変数や引数にも同じhpという名前の変数がある場合
        // そちらが優先されてしまうなど予想外の動作になる可能性がある
        // そのため、明示的にthisをつけておく
        this.hp = 100;
        System.out.println(this.name + "は、眠って回復した！");
    }
    
    void sit(int sec){
        this.hp += sec;
        System.out.println(this.name + "は、" + sec + "秒座った！");
        System.out.println("HPが" + sec + "ポイント回復した");
    }
    
    void slip(){
        this.hp -= 5;
        System.out.println(this.name + "は、転んだ！");
        System.out.println("5のダメージ！");
    }
    
    void run(){
        System.out.println(this.name + "は、逃げ出した！");
        System.out.println("GAMEOVER");
        System.out.println("最終HPは" + this.hp + "でした");
    }
}
