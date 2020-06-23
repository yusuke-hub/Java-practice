package academy.learnprograming;

public class Main {

    public static void main(String[] args) {
	    String s1 = "スッキリJava";
	    String s2 = "Java";
	    String s3 = "java";
	    String s4 = "";
	    String s5 = "Java";
	    if(s2.equals(s5)) {
            System.out.println("s2とs5は等しい");
        }
        if(s2.equalsIgnoreCase(s3)) {
            System.out.println("s2とs3はケースを区別しなければ等しい");
        }
        System.out.println("s1の長さは" + s1.length() + "です");
        if(s4.isEmpty()) {
            System.out.println("s4は空文字です");
        }
        System.out.println("");

        String s6 = "Java and Javascript";
        if(s6.contains("Java")) {
            System.out.println("文字列s6は、Javaを含んでいます");
        }
        if(s6.endsWith("Java")) {
            System.out.println("文字列s6は、Javaが末尾にあります");
        }
        System.out.println("文字列s6で最初にJavaが登場する位置は" + s6.indexOf("Java"));
        System.out.println("文字列s6で最後にJavaが登場する位置は" + s6.lastIndexOf("Java"));
        System.out.println("");

        String s7 = "Java Programming";
        // substring()メソッド
            // 引数1つ 指定位置より後ろにある全ての文字列を返す
            // 引数2つ 2つの指定位置の間にある部分文字列を返す
        System.out.println("文字列s7の3文字目以降は" + s7.substring(3)); // a Programming
        System.out.println("文字列s7の3-8文字目以降は" + s7.substring(3, 8)); // a Pro


    }
}
