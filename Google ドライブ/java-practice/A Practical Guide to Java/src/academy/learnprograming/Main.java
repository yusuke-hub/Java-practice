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

        // ★ ストリーム
        //  一度にまとめてファイルを読み込んでしまうと、メモリ不足や処理に長時間かかる
        //  などの不都合が生じるため、外部データは少しずつ 読んだり書いたりするのが基本
        //  単なるデータの読み書きを小川として抽象的に捉えることで、様々な応用や発展が考えられる
            // 文字ストリーム
            // バイトストリーム
                // 標準出力
                    // System.out
                // 標準エラー出力
                    // System.err
                        // 標準入力
                            // System.in

        // ★ StrinReaderクラス
        // 通常ストリームはJVM外部のデータあを少しずつ読み書きする際に利用しますが、
        // JVM内部の変数の読み書きにも応用できる
            // throwsで例外処理を省略しているので、実際の開発では正しく例外処理を行うこと！
                // public static void main(String[] args) throws IOException {
                // String msg = "第一土曜";
                // Reader sr = new StringBUilder(msg);
                // char c1 = (char) sr.read();
                // char c2 = (char) sr.read();
                // ...
                // }
        // ★ ByteArrayOutputStreamクラス
        //  バイト配列に対して1バイトずつ、順次書き込んでいく
        //  書き込み完了したところで、toByteArray()メソッドを呼び出せば、バイト配列が得られる
                // public static void main(String[] args) throws IOException {
                    // ByteArrayOutputStream baos = new ByteArrayOutputStream();
                    // baos.write(65);
                    // baos.write(66);
                    // byte[] data = baos.toByteArray();
                    // ...
                // }

        // ★ フィルタ
        //  流れるデータに対して、多種多様な変換を行うことができるもの
            // ● 特徴
            // 1, Filter~クラスを継承している
            // 2, 単独で存在できず、他に接続する形で生成する
                // まず通常のファイル出力ストリームfosを生成
                    // FileOutputStream fos = new FileOutputStream("data.txt");
                // このストリームを下流に持つ暗号化ストリームcosを生成し接続
                    // CipherOutputStream cos = new CipherOutputStream(fos);
                // cosに書き込めば、暗号化された上で、ファイルに流れていく
                    // cos.write(65);
            // 3, フィルタを複数連結することもできる
                // まず通常のファイル出力ストリームfosを生成
                    // FileOutputStream fos = new FileOutputStream("data.txt");
                // このストリームを下流に持つ暗号化ストリームcosを接続
                    // CipherOutputStream cos = new CipherOutputStream(fos);
                // さらに文字バイト変換をするストリームwosを接続
                    // WriterOutputStream wos = new WriterOutputStream(cos);
                // wos２文字を書き込めば、バイト変換 & 暗号化が実行され、ファイルに流れていく
                    // wos.write("AB");

            // ● バッファリングフィルタ
                // 上流から少しずつ流れてくるデータを溜め込み、
                // まとまった量になったところで一気に下流に流す仕事をしてくれる
                    // 文字情報用: BufferedReader, BufferedWriter
                    // バイト情報用: BUfferedInputStream, BufferedOutputStream
                // ◯ メリット
                    // 1, 処理性能の向上
                        // ファイルを保存するために何気なく李硫黄しているハードディスクは、
                        // メモリに比べて大容量ではあるものの読み書きの速度が遅いという欠点がある
                        // ファイルの読み書きを要求するたびに、
                        // ハードディスク内部のヘッドという機械が動いて、
                        // ディスク上のデータに対して読み書きを行う
                            // 少量のデータを何度も書き込む要求をするより、データを一まとめにして
                            // 1回の書き込みを要求する方が圧倒的に早く処理が完了する
                    // 2, まとまった単位でデータを読める
                        // FileReader fr = new FileReader("rpgsave.dat");
                        // BufferedReader br = new BufferdReader(fr);
                        // String line = null;
                        // while((line = br.readLine()) != null) {
                        //  /* ここでlineの内容を利用した処理 */
                        // }

            // ★ データフォーマット
            //  複数のデータをどのような形式、順序で保存するかということを定めたルール
            //  分業開発を行う上では、明確に文書化しておくべきもの
            //  きちんとデータフォーマットが決められ、書き込み処理と読み込み処理の双方で遵守されていなければ、
            //  ファイルの読み書きを正しく行うことはできない
                // ● ファイルフォーマット
                //  ファイルのデータ構造を規定するもの
                // ● メッセージフォーマット(電文フォーマット)
                //  ネットワーク経由で伝送される一塊りのメッセージのデータ構造を規定するもの
                    // public void saveHeroToFile(Hero h) throws IOException {
                    //  Wrtier w = new BufferedWriter(new FileWriter("rpgsave.dat");
                    //  w.write(h.name + "¥n");
                    //  w.write(h.hp + "¥n");
                    //  w.write(h.mp + "¥n");
                    //  w.fllush();
                    //  w.close();
                    // }

                // ● CSV(Comma-Separated Values)
                //  複数のデータを間まで区切って順に格納するデータフォーマット
                //  汎用性の高いフォーマットだが、
                //  データ自体にカンマ記号が含まれる場合や
                //  改行の取り扱いに注意が必要
                //  より厳密なCSVの操作には、「opencsv」「OrangeSignalCSV」がオススメ
                    // ◯ デリミタ
                    //  データを区切るために使う文字
                        // bw.write(h.name);
                        // bw.write(",");
                        // bw.write(h.hp);
                        // bw.write(",");
                        // bw.write(h.mp);
                            // ⚫ ︎StringTokenizerクラス
                            //  指定したデリミタで文字列を分割し、それぞれのデータ(トークン)
                            //  を順次取得する機能を提供する
                                // String s = "ミナト、アサカ, スガワラ";
                                // StringTokenizer st = new StringTOkenizer(s, ",");
                                // while(st.hasMoreTokens()) {
                                //  String t = st.nextTokens();
                                //  System.out.println(t);
                // ★ プロパティファイル
                    //  データは文字列情報として保存する
                    //  各行には「キー」「値」をペアとして、それらを「ペアデリミタ」
                    //  で区切って記述する
                    //  ペアデリミタは=(イコール)、;(コロン)、空白のいずれかの文字
                    //  #(シャープ)、!(感嘆符)で始まる行はコメントとして無視される
                    //  ファイルの拡張子には「.properties」

                        // ● 読み込み
                            //  Reader fr = new FileReader("c:¥¥rpgdata.properties");
                            //  Properties p = new Properties();
                            //  ファイルの内容を読み込む
                            //  p.load(fr);
                            //  キーを指定し値を取り出す
                            //  String name = p.getProperty("heroName");
                            //  String strHp = p.getProperty("heroHp");
                            //  int hp = Integer.parseInt(strHp);
                            //  System.out.println("勇者の名前:" + name);
                            //  System.out.println("勇者のHP:" + hp);
                            //  fr.close();
                        // ● 書き込み
                            //  Writer fw = new File Writer("c:¥¥rpgsave.properties");
                            //  Properties p = new Properties();
                            //  データのセットを行う
                            //  p.setProperty("heroName", "アサカ");
                            //  p.setProperty("heroHp", "32");
                            //  p.setProperty("heroMp", "45");
                            // "勇者の情報"はファイルの先頭にコメントとして出力される
                            // setProperty()を呼び出すだけではファイルに書き込まれないので
                            // 必ずstore()を呼び出して、保存する!
                            //  p.store(fw, "勇者の情報");
                            //  fw.close();
                                // ◯ getResourceAsStream()メソッド
                                //  クラスパスを基準とした指定でファイルを開くことができるメソッド
                                //  実行環境のフォルダの構成の違いに影響されにくいプログラムを作りたい場合に有効
                                    //  InputStream is = Main.class.getResourceAsStream("¥¥rpg¥¥rpgsave.dat");


                // ★ XML(Xtensible Markup Language)形式
                //  データの内容に親子関係の構造がある場合に用いる
                //  不等号記号で囲まれたラベルの中にデータを記述するフォーマットであり、
                //  タグの中に別のタグをネストさせ、親子関係の構造にすることも可能
                    // ● JAXP(Java API for XML Processing)
                    //  javax.xml.parsersパッケージやorg.w3c.domパッケージなどから構成される、比較的複雑なAPI
                        //  InputStream is = new FileInputStream("c:¥¥rpgsave.xml");
                        // ① 文書全体を取得
                        //  Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(is);
                        // ② 一番外側のheroタグを取得
                        //  Element hero = doc.getDocumentElement();
                        // ③ その中のweaponタグを取得
                        //  Element weapon = findChildByTag(hero, "weapon");
                        // ④ その中のpowerタグを取得
                        // Element power = findChildByTag(weapon, "power");
                        // ④ その中の文字列情報を取得
                        // String value = power.getTextContent();

                        // static Element findChildByTag(Element self, String name)
                        //      throws Exception {
                        //  全ての子を取得
                        //  NodeList children = self.getChildNodes();
                        //  for(int i = 0; i < childrengetLength(); i++) {
                        //      if(children.item(i) instanceof Element) {
                        //          Element e = (Element) children.item(i);
                        //  タグ名を照合
                        //          if(e.getTagName().equals(name)) {
                        //              return e;
                        //          }
                        //      }
                        //  }
                        //  return null;
                        // }
                            // ◯ JSON(JavaScript Object Nortation)
                            //  ブラウザの上で動作するJavaScriptで利用されていたデータフォーマットだが、
                            //  XMLに比べてデータ量が少なくて済むなど、様々な長所を持つことから
                            //  近年広く使われている

        }




}
