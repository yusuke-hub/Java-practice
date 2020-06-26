package academy.learnprograming;
// static import宣言を行うことで、
// 列挙子以外にもstaticがついたクラスメンバについて
// 記述の省略を可能にする
import java.util.Iterator;
import java.util.Properties;
import java.util.function.IntBinaryOperator;
import java.util.function.*;

import static academy.learnprograming.AccountType.FUTSU;

class Sword {
    public String name;

    public Sword(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Hero implements Cloneable {
    public String name;
    public Sword sword;
    private int hp, mp;

    public Hero() {
    }

    public Hero(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSword(Sword sword) {
        this.sword = sword;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    public String getName() {
        return name;
    }

    public Sword getSword() {
        return sword;
    }

    public int getHp() {
        return hp;
    }

    public int getMp() {
        return mp;
    }

    // ★インスタンスを複製する方法
    // 1, Cloneableインターフェースを実装する
        // これにはclone()は定義されておらず、clone()を実装することで
        // 複製に対応していることを表明するためだけに存在する(マーカーインターフェース)
    // 2, cloneメソッドをpublicでオーバーライドする
        // 子クラスにおけるオーバーライド時のアクセス修飾子は、
        // 親クラスにおけるそれと同じか、よりゆるいアクセス修飾子に限定される
    public Hero clone() {
        Hero result = new Hero();
        result.name = this.name;
        result.hp = this.hp;
        result.sword = this.sword;
        // clone()でswordも複製するためには
        // resule.sword = this.sword.clone()とする
        return result;
    }
    // ★Objectクラスによる効能
    // 1, 全クラスは、Objectクラスで定義されたメソッドを持っていることが保証される
    // 2, Object型変数は、あらゆるインスタンスを代入可能である
    // ●多くのインスタンスに共通して行える5つのメソッド
    // 1, toString() 文字列表現をえる
    // 2, equals() 等価判定を行う
    // 3, hashCode() ハッシュ値を得る
    // 4, compareTo() 大小関係を判定する

        // 5, clone() 複製する
    // 新たにクラスを作ったら、適切な文字列表現を返すようオーバーライドを忘れずに行う

    public String toString() {
        return "勇者(名前=" + this.name + "/HP=" + this.hp + "/MP=" + this.mp + ")";
    }


    public int hashCode() {
        int result = 37;
        result = result * 31 + name.hashCode();
        result = result * 31 + hp;
        return result;
    }
}

// ★ジェネリクス
// 1, クラス宣言時に、EやKという「仮の型名」を使っておく
    // 仮型引数の段階で、利用できる実型引数を制限できる
        // ex, public class Pocket <E extends Character>
// 2, クラス利用時に、それをStringなどの「実際の型」に置換して利用する

// ↓ジェネリクスを使わずに実現したPocketクラス(V1)
//    class Pocket {
//    private Object data;
//    public void put(Object d) {
//        this.data = d;
//    }
//    public Object get() {
//        return this.data;
//    }
//    }

// ジェネリクスを使ったPocketクラス(V2)
class Pocket<E> {
    private E data;

    public void put(E d) {
        this.data = d;
    }

    public E get() {
        return this.data;
    }
}
public class Main {
    public static int sub(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        // Object型変数dataに値が格納された瞬間、
        // その情報が元々Stringインスタンスであったことは忘れ去られるため
        // キャストしなおさないといけなくなる
        Pocket p = new Pocket();
        p.put("1192");
        String s = (String) p.get();
        System.out.println(s);

        Account ac = new Account("172637482", FUTSU);

        // ★変数へのメソッド参照の格納
        // 変数名 = クラス名::そのクラスの静的メソッド名
        // 変数名 = インスタンス変数名::そのインスタンスのメソッド名

        // 宣言したインターフェースの方に代入
        // MyFunction func = Main::sub;
        // Mainクラスのsubメソッドではなく、インターフェースのメソッドで呼び出し
        // int a = func.call(5, 3);
        // System.out.println("5-3ja" + a);

        // 左辺が実行された瞬間、関数の実態が生み出される
        // IntBinaryOperator func = (int a, int b) -> { return a ? b; };
        // int a = func.applyAsInt(5, 3);
        // System.out.println("5-3は" + a);

        // ★ラムダ式
        // 関数（ある入力を受け取り、出力を返す一連の処理ロジック）を、
        // プログラム実行中の必要になったタイミングで生み出して即時利用することができる
            // (型 引数名1, 型 引数名2,...) -> {
            //  処理1;
            //  処理2;...
            //  return 戻り値;
            //  }
                // ex1, 勇者インスタンスを受け取り、そのHPを返す
                    // (Hero h) -> {return h.getHp();}
                // ex2, 何も受け取らず、現在日時を返す
                    // () -> { return new java.util.Date(); }
                // ex3, long配列を受け取り、そのコピーを作り、内容を並び替えて返す
                    // (long[] array) -> {
                    //    long[] array2 = java.util.Arrays.copyOf(array, array.length);
                    //    java.util.Arrays.sort(array2);
                    //    return array2;
                    // }
                // ex4, 関数オブジェクトを受け取り、2回呼び出した合計を返す
                    //  (IntBinaryOperator func, int a, int b) -> {
                    //    int result = func.applyAsInt(a, b) + func.applyAsInt(a, b);
                    //    return result;
                    //  }
                        // *省略記法
                            // IntToDoubleFunction func = (int x) -> { return x * x * 3.14; }
                            // IntToDoubleFunction func = (x) -> { return x * x * 3.14; }
                            // IntToDoubleFunction func = x -> { return x * x * 3.14; }
                            // IntToDoubleFunction func = x -> return x * x * 3.14;
                        // *応用
                            // ラムダ式の外にある変数を利用することができる
                            // 外にある変数を式の中で書き換えることはできないので注意
                            // double b = 1.41;
                            // IntToDoubleFunction func = (x) -> {
                            //   return x * x * b;
                            //  }

        // ★System.exit()メソッド
        // 引数にはint型の数字を入れることができ、
        // 0は正常終了、それ以外は異常終了を意味する
            // if(データが正しくないなら) {
            //   System.out.println("データが壊れています。異常終了します");
            //   System.exit(1);
            // }

        // ★Process Builder
        // 計算が完了したら、メモ帳を起動するプログラム
        // System.out.println("計算を開始します");
        // ...
        // System.out.println("計算完了。結果をメモ帳で表示します")
        // コンストラクタは、幾つでも文字列を渡せる可変長変数になっており、
        // 起動するプログラムファイルや起動引数を指定する
        // ProcessBuilder pb = new ProcessBuilder(
            //      "c:¥¥windows¥¥system32¥¥notepad.exe",
            //      "calcreport.txt"
            // );
        // start()メソッドの戻り値として得られるProcessインスタンスを用いて、
        // 起動したプログラムの終了をまったり、その終了コードを得ることができる
            // pb.start();

        // ★システムプロパティ
        // 私たちがプログラム中で宣言、生成するmapとは別に、実はJVM自信も内部に
        // Map<String, String>を持っていて、JVMの動作に関する様々な情報を格納、利用している。
        // このJVMが持つ、文字列ペアの集合をシステムプロパティと呼ぶ。
            // java.version   実行中のJREのバージョン
            // java.home      実行中のJavaのインストール先のディレクトリ
            // os.name        動作中のOSの名前
            // line.separator 動作中のOSの改行コード
            // user.name      実行したユーザーの名前

        // ●システムプロパティの取得
        System.out.println("ご利用のJavaのバージョン");
        System.out.println(System.getProperty("Java.version"));
        Properties properties = System.getProperties();
        Iterator<String> i = properties.stringPropertyNames().iterator();
        System.out.println("【システムプロパティ一覧】");
        while(i.hasNext()) {
            String key = i.next();
             System.out.print(key + " = ");
            System.out.println(System.getProperty(key));
        }
        // ●環境依存を排除する
        // Javaの大きな強みは、JVMが動作するなら
        // どのようなOSでも同様に動作することであるが、100%ではない
        // 開業に関連する特殊文字はOSによって、違いがある
        // 以下がその例
            // System.out.println("本日は¥晴天なり");
                // 実行結果
                    // Linux
                        // 本日は
                        // 晴天なり
                    // 古いMacOS
                        // 本日は晴天なり
        // 「line.separotr」システムプロパティで改善
            // 現在動作中のOSが採用している開業コードが自動的に格納される
            final String BR = System.getProperty("line.separator");
            System.out.println("本日は" + BR + "晴天なり");

        // ●システムプロパティの設定
        String ver = System.getProperty("rpg.version");
        String author = System.getProperty("rpg.author");
        System.out.println("RPG: スッキリ魔王征伐 ver be" + ver);
        System.out.println("Developed by " + author);

        // ★ FileWriterを用いたサンプルコード
            // FileWriterのインスタンス化
            // * 第一引数に文字列を指定する場合、フォルダ区切りの¥記号を2つにする!
            // * 第二引数がtrue → すでにファイルが存在していた場合、その末尾にデータを追記していく
            //            false, 省略 → ファイルの先頭からデータを上書きしていく
                // FileWriter fw = new FileWriter("c:¥¥rpgsave.dat", true);

            // バッファという仕組みにより、ファイルの読み書きを高速化するために、
            // 後でまとめて書き込み処理がされることがある
            // writeメソッドはデータの書き込みを要求するだけの命令であり、
            // すぐにファイルがデータに書き込まれるとは限らないため、
            // ファイルを閉じる前に、flush()を呼び出すことで、
            // JVMに対して、「今までに書き込み依頼したデータで、
            // 実際には書き込んでいない部分があれば、今すぐ書き出せ！」指示をする
                // fw.write('A);
                // fw.flush();
                // fw.close();

        // ★ FileReaderを用いたサンプルコード
            // FileReader
                // ファイルの先頭から1文字ずつデータを読み込んでいく
                    // FileReader fw = new FIleReader("rpgsave.dat");

            // System.out.println("全てのデータを読み込んで表示します");
            // read()により、ファイルから1文字を読み込む際、
            // char型ではなく、int型として返されている!!
                // もし「ファイルの最後まで読み終わってしまい、もうこれ以上読むデータがない」場合
                // その事実を呼び出し元に伝えなければならず、その場合、-1を返すことになる
                // しかしchar型では-1という数値は返せないため、苦肉の策としてint型で返す
                    // int i = fw.read();

            // while(i != -1) {
                    //  char c = (char) i;
            //  System.out.println(c);
            //  i = fw.read();
            // }
            // System.out.println("ファイルの末尾に到達しました");
            // fw.close();

        // ★ バイナリファイルの読み書き
            // ● テキストファイル
            //  文字列として解釈可能なデータ(文字列)
            //  FileReader,FileWriter
                //  FileWriterは引数で与えられた文字をバイト表現に変換してファイルに書き込む
                //  FileReaderもファイルから読んだバイト表現を文字列情報に変換して返す
            // ● バイナリファイル
            //  文字とは解釈できないデータ(バイト列)
            //  FileInputStream(読み込み),FileOutputStream(書き込み)
                // FileOutputStream fos = new FileOutputStream("rpgsave.dat", true);
                // fos.write(65);
                // fos.flush();
                // fos.close();

        // ★ 日本語と文字コード体系
            //  日本人は、英語圏の人々と異なり、
            //  アルファベットの小文字と大文字、数字、各種記号以外にも、
            //  平仮名、カタカナ、漢字などたくさんの種類の文字を使う
            //  これらの文字は1バイトでは表現できないため、
            //  日本では、「基本的に2バイトを使って、1文字を表現する」方式を採用した
            //  ところがいろんな人が異なるルールを提唱したため
            //  統一されず現在に至っている
                // JIS,ShiftJIS,EUC,UTF-8など..
                    // ❇︎ FileReadereやFileWriterでは、システム標準の文字コード体系が利用される

        // ★ 恐ろしいファイルの閉じ忘れ
        //  ファイル操作を行う場合に、陥りやすい
        //  そして実際に陥ると致命的な不具合に繋がる落とし穴がある
            // close()をきちんと記述していても、
            // 直前の処理で例外が発生し、強制終了といったことが発生する

                //★ 正しく例外処理を行うプログラム1 ← やや冗長ではある
                    // FileWriter fw = null;
                    // try {
                    //      fw = new FileWriter("rpssave.dat", true);
                    //      fw.write('A');
                    //      fw.flush();
                    // } catch(IOException e) {
                    //     System.out.println("ファイル書き込みエラーです");
                // close()は、一度tryブロックの処理が行われたら、その後に何があっても
                // （途中でreturnしても、例外が発生しても)必ず実行される」
                //  finallyブロックに記述する
                  // close()がIOEXceptionを創出する可能性があるため、
                  // 再度try-catchが必要。ただし失敗しても何もできないため
                  // catchブロック内は空にしてある
                    // } finally {
                    //   if(fw != null) {
                    //     try {
                    //       if(fw != null) {
                    //         fw.close();
                    //       }
                    //     } catch(IOException e2) { }
                    //   }

                //★ 正しく例外処理を行うプログラム2 ← エレガントな記述
                    // try(FileWriter fw = new FileWriter("rpgsave.dat");) {
                    // /* 正常処理 */
                    // } catch(IOEXception e) {
                    // /* 例外処理 */
                    // }

        }




}
