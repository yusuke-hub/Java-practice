public class Main {
  public static void main(String[] args) {

    // switch文
    // *breakの書き忘れに注意
    String signal = "oppai";

    switch (signal) {
      case "red":
        System.out.println("stop!");
        break;
      case "blue":
        System.out.println("go!");
        break;
      case "yellow":
        System.out.println("caution!");
        break;
      default:
        System.out.println("wrong signal!");
        break;
    }
  }
}