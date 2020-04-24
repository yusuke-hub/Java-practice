public class Main {
  public static void main(final String[] args) {

    // 配列
    // sales1, sales2...
    // sales

    // データ型[]
    // int[] sales;

    // 配列を宣言したらデータ領域を確保するために,newを行う
    // sales = new int[3];

    // 1つずつ値を入れる方法
      // 配列の要素は0から始まる
      // 配列[添え字(index)]
        // sales[0] = 100;
        // sales[1] = 200;
        // sales[2] = 300;

    // まとめて値を入れる方法
      // sales = new int[3] { 100, 200, 300 };
        int[] sales = { 100, 200, 300 };

        System.out.println(sales[1]);

        sales[1] = 1000;
        System.out.println(sales[1]);

  }
}