// generics
// 汎用化されたデータ型でクラスやインターフェースを作ることができる

// <>という記号をつけて、汎用化する方をどう表現するか指定する
// Typeと言う意味で大文字のTが使われることが多い
class MyData<T> {
  public void getThree(T x) {
    System.out.println(x);
    System.out.println(x);
    System.out.println(x);
  }
}

public class MyApp {
  public static void main(String[] args) {
    // <>内に入るデータ型は参照型のみ
    MyData<Integer> i = new MyData<>();
    i.getThree(55);
    MyData<String> s = new MyData<>();
    s.getThree("Matui");
  }
}
