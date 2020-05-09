
// Randomクラスをjavaのutilパッケージからimport
import java.util.Random;

public class MyApp {
  public static void main(String[] args) {
    double d = 35.121;
    System.out.println(Math.ceil(d)); // 切り上げ
    System.out.println(Math.floor(d)); // 切り捨て
    System.out.println(Math.round(d)); // 四捨五入
    System.out.println(Math.PI); // 円周率

    Random r = new Random();
    System.out.println(r.nextDouble()); // 0 - 1
    System.out.println(r.nextInt(100)); // 0 - 100
    System.out.println(r.nextBoolean()); // 真偽値

  }
}
