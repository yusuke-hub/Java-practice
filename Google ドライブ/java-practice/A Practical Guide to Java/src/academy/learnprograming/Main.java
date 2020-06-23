package academy.learnprograming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        // ★コレクションフレームワーク(Collenction Framework)
            // データをまとめて格納するための入れ物クラスたち
                // List
                    // 順序通りに並べて格納する(中身の重複可)
                // Map
                    // ペアで対応づけて格納する
                // Set
                    // 順序があるとは限らない(中身の重複不可)
                        // *ルール
                        // 1 import文を記述する
                        // 2 不等号の括弧を使い、格納するものの方を指定する
                            // ex, ArrayList<String>
                        // 3 確保の際にサイズを指定せず、要素は随時追加が可能
                            // このため配列よりもArrayListの方が多く使われているが、
                            // 配列の方がメモリ効率や性能は高いし、コレクションにもできないことがある
                                // インスタンスでないものを格納できない
                                    // × ArrayList<int> ● ArrayList<Integer>
        // オートボクシング
            // プリミティブ型 → ラッパークラス
        // アンボクシング
            // ↑の逆

        ArrayList<Integer> points = new ArrayList<Integer>();
        points.add(10);
        points.add(80);
        points.add(75);
        points.add(3, 100);
        for(int i : points) {
            System.out.println(i);
        }
        System.out.println(points.get(1));
        System.out.println("ArrayList「points」に格納されている要素の数は、" + points.size() + "個です");
        if(points.contains(100)) {
            System.out.println("スコアが100の人がいます！");
        }
        points.remove(0);
        System.out.println("スコア80は配列の" + (points.indexOf(80) + 1) + "番目に格納されています");
        points.clear();
        if(points.isEmpty()) {
            System.out.println("ArrayList「points」には格納されている要素がありません");
        }
    }



}
