package academy.learnprograming;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        // Dateクラス
            // Javaで時刻情報を取り扱う場合に標準的に利用される
            // java.utilパッケージに属する
            // 内部にエポック(基準時刻である1970年元日0時ちょうど)からの経過ミリ秒数をlong値で保持している
            // new()でインスタンス化すると、現在の日時情報が格納される
            // new(long 値)でインスタンス化すると、指定時刻の情報が格納される
            // getTime()、setTime()を用いてインスタンス内に保持するlong値を取得、設定できる
                // *人間が取り扱いづらい
        Date now = new Date();
        System.out.println(now);
        System.out.println(now.getTime());
        Date past = new Date(1316622225935L);
        System.out.println(past);

        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        // ↓ Calendarインスタンスが返す月の範囲は0-11なので注意
        int month = cal.get(Calendar.MONTH) + 1;
        int day = cal.get(Calendar.DAY_OF_MONTH);
        System.out.println(year);
        System.out.println(month);
        System.out.println(day);


        int myBirthYear = cal.get(Calendar.YEAR) - 25;
        int myBirthMonth = 7;
        int myBirthDay = cal.get(Calendar.DAY_OF_MONTH) - 15;
        System.out.println("僕の誕生日は " + myBirthYear + "年" + myBirthMonth + "月" + myBirthDay + "日 です\n");
        System.out.println("");
    }



}
