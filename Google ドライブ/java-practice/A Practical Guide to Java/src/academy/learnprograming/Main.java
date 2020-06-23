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


    }
}
