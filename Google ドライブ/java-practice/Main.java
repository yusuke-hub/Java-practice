public class Main {
  public static void main(final String[] args) {

    // while
    // 条件判定が前
    // 0 - 9
    int i = 0;
    // while (i < 10) {
    // System.out.println(i);
    // i++;
    // }

    // do - while
    // 条件判定が後
    do {
      System.out.println(i);
      i++;
    } while (i < 10);
  }

}