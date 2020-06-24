package academy.learnprograming;

public class Account {
    String accountNo;

    // ★equalsメソッドをオーバーライドする際の定石
    public boolean equals(Object o) {
        // 1, 自分自身が引数として渡されてきた時、無条件でtrueを返す
        if(o == this) return true;
        // 2, nullが引数として渡されてきた時、無条件でfalseを返す
        if(o == null) return false;
        // 3, 比較し方が異なるならば、falseを返す(同じなら4に備えて、比較できるよう適切にキャストする)
        if(!(o instanceof Account)) return false;
        // 4, 2つのインスタンスが持つしかるべきフィールド同士を比較して等価か判定し、trueかfalseを返す
        Account r = (Account) o;
        if(!this.accountNo.trim().equals(r.accountNo.trim())) {
            return false;
        }
        return true;
    }
    // → クラスを作った際はequalsメソッドを必ずオーバーライドする!!
        // *不要な場合は以下のケース
            // そもそも等価を判定されることが考えられないクラス(データではなく、主に処理ロジックを持っているクラス)
            // 親クラスは既にオーバーライドされていて、そのロジックで問題のないクラス
                // *equalsの計算コスト
                    // 1, 高速だが、曖昧な方法で、各要素に「大体同じか」を問い合わせる
                    // 2, 「大体同じ」な要素にだけ、equals()で「厳密に同じか？」を問い合わせる
                        // 1で用いるのがハッシュ値(hash code)
                        // 全てのインスタンスにはhashCode()を呼び出された際に、
                        // 「ハッシュ値の条件」に従った値を返す義務がある
                            // ★ハッシュ値
                                // インスタンスの内容を数値として要約したもの
                                    // - 同じインスタンスからは、必ず同じハッシュ値が得られる
                                    // - 異なるインスタンスからは、なるべく異なるハッシュ値が得られる
}
