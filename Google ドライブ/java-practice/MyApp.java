import java.util.*;

public class MyApp {
  public static void main(String[] args) {
    // HashMap: key value
    // 複数データ管理をするためのもの
    // TreeMap
    // データを保持する順番はkeyによってソートされた順番
    // LinkedHashMap
    // データを保持する順番は追加された順番

    // HashMap<String, Integer> sales = new HashMap<>();
    TreeMap<String, Integer> sales = new TreeMap<>();

    sales.put("tom", 10);
    sales.put("bob", 20);
    sales.put("steve", 30);

    System.out.println(sales.get("tom"));
    System.out.println(sales.size());

    // Map.Entry
    // Mapの中身を確認する
    for (Map.Entry<String, Integer> sale : sales.entrySet()) {
      System.out.println(sale.getKey() + ":" + sale.getValue());
    }

    sales.put("tom", 100);
    sales.remove("steve");

    for (Map.Entry<String, Integer> sale : sales.entrySet()) {
      System.out.println(sale.getKey() + ":" + sale.getValue());
    }
  }

}