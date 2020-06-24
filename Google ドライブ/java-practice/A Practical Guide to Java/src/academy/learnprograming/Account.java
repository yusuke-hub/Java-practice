package academy.learnprograming;

public class Account {
    int number;

    //        List<Account> list = new ArrayList<Account>();
    //        ...
    //        Collections.sort(list);
        //        → 制約の不一致：型 Collectionsの総称メソッド
        //        sort(List<T>)は引数(List<Account>)に適用できません。
        //        推測される型 Accountは、制約付パラメーター
        //        <T extends Comparable <? super T>の代替として有効ではありません

    //sortで並び替えをするなら、どのように並べるのか指定する必要がある
    // それで利用するのが、java.lang.Comparableインターフェース
    // これのcompareTo()メソッドをオーバーライドすることで、
    // Collectionsクラスのsort()は、格納している
    // それぞれのインスタンスのcompareTo()を呼び出し、
    // 大小関係を比較しながら、並び替えを実行してくれる
    public int compareTo(Account obj) {
        if(this.number < obj.number) {
            return -1;
        }
        if(this.number > obj.number) {
            return 1;
        }
        return 0;
    }

}
