package academy.learnprograming;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        // LinkedHashSet
            // 値を格納した順序に整列するが、for文やイテレータを使って、セットの中身を1つずつ取り出す場合、
            // どのような順序で要素が取り出せるかは一切確約されていない
        Set<String> colors = new HashSet<String>();
        colors.add("赤");
        colors.add("青");
        colors.add("黄");
        colors.add("赤");
        System.out.println("色は" + colors.size() + "種類"); // 色は3種類 → 重複は無視される
        for(String s : colors) {
            System.out.print(s + "→");
        }
        // TreeSet
            // String型の複数の文字列を格納すると、「辞書順」で取り出すことができる
        System.out.println("");
        Set<String> words = new TreeSet<String>();
        words.add("dog");
        words.add("cat");
        words.add("wolf");
        words.add("panda");
        for(String s : words) {
            System.out.print(s + "→");
        }
    }



}
