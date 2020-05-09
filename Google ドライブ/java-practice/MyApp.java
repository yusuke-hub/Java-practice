// Thread

// public interface Runnable
// このクラスは引数のないメソッドrunを定義しなければならない。
// Thread をサブクラス化せずにクラスをアクティブにする手段を提供する
// Thread のインスタンスを生成し、ターゲットとしてクラス自身を渡すことにより Thread をサブクラス化をしなくても実行できる

class MyRunnable implements Runnable {
  // Runnableの抽象メソッドをoverride
  @Override
  public void run() {
    for (int i = 0; i < 500; i++) {
      // 改行を切るためにはprintとすればOK
      System.out.print("*");
    }
  }
}

public class MyApp {
  public static void main(String[] args) {
    MyRunnable r = new MyRunnable();
    // Thread t = new Thread(r);
    // t.start();

    // 無名クラス
    // 抽象メソッドをその場で実装していく
    // インターフェースをインスタンス化しているように見えるが、
    // 実際はそのインターフェースを実装しているクラスをインスタンス化していることになる
    // new Thread(new Runnable() {
    // // Runnableの抽象メソッドをoverride
    // @Override
    // public void run() {
    // for (int i = 0; i < 500; i++) {
    // // 改行を切るためにはprintとすればOK
    // System.out.print("*");
    // }
    // }
    // }).start();

    // ラムダ式
    // lambda: ギリシャ文字のアルファベット第11字「λ」
    new Thread(() -> {
      // Runnableの抽象メソッドをoverride
      for (int i = 0; i < 500; i++) {
        // 改行を切るためにはprintとすればOK
        System.out.print("*");
      }
    }).start();

    for (int i = 0; i < 500; i++) {
      System.out.print(",");
    }
  }
}

// public synchronized void start() {
// if (threadStatus != 0)
// throw new IllegalThreadStateException();

// this = Threadクラス
// group.add(this);

// boolean started = false;

// try..catch..finally
// tryブロックの中で例外が発生すると残りの処理はおこなわれずにcatchブロックへ処理が移る
// try文を終了する前に必ず実行させたい処理がある場合、finallyを使用して記述する

// try {

// start0();
// → private native void start0();
// → native修飾子
// メソッドがネイティブメソッド(Java以外の言語で実装されているメソッド）である事を示す

// started = true;

// } finally {
// try {
// if (!started) {
// group.threadStartFailed(this);
// }
// } catch (Throwable ignore) {

// }
// }
// }
