package academy.learnprograming;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // splitメソッド
        // replaceAllメソッド
        String s = "abc,def:ghi";
        s = s.replaceAll("[beh]", "X");
        String[] words = s.split("[,:]");
        for(String w : words) {
            System.out.println(w + "->");
            // aXc->
            // dXf->
            // gXi->
        }

    }



}
