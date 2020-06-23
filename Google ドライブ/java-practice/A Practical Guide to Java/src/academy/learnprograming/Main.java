package academy.learnprograming;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        // イテレータ
            // リストに含まれる1つの箱を「ここ!」と 指している矢印のようなもの
        ArrayList<String> names = new ArrayList<String>();
        names.add("佐藤");
        names.add("岸野");
        names.add("嶋田");
        // イテレータのインスタンスを生み出す場合は、newを使わず、
        // iteratorメソッドを呼び出す
        // これによりリストの先頭(最初の箱よりもっと前）を指した状態の矢印を取得する
        Iterator<String> it = names.iterator();
        while(it.hasNext()) {
            String e = it.next();
            System.out.println(e);
        }
    }



}
