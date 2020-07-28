package academy.learnprograming;

// 曲のプレイリストを実装するプログラムを作成します。
// 曲のタイトルと期間を持つSongクラスを作成します。
// プログラムには、曲のリストを含むアルバムクラスが作成されます。
// アルバムはArrayListに格納されます。
// 異なるアルバムの曲をプレイリストに追加することができ、順番にリストに表示されます。
// 彼らは追加されます。
// 曲がプレイリストに追加されたら、オプションメニューを作成します。
// 終了、次の曲へスキップ、前の曲へスキップします。 現在の曲を再生します。
// プレイリストの曲をリストアップします。
// プレイリストに追加する前に、アルバム内に曲が存在している必要があります。
// あなたのもの）。)
// ヒント：曲を再生するには、前の街を行ったり来たりしたときのことを考えてみてください。
// 方向の追跡を開始しました。
// オプションとして、プレイリストから現在の曲を削除するオプションを提供します。
// (ヒント: listiterator.remove()

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        Song newSong1 = new Song("悲しみなんか笑い飛ばせ", 340);
        Song newSong2 = new Song("ありがとう", 370);
        Song newSong3 = new Song("旅立ち", 248);
        LinkedList<Song> playList = new LinkedList<Song>();
        Album myAlbum = new Album(playList);
        myAlbum.add(playList, newSong1);
        myAlbum.add(playList, newSong2);
        myAlbum.add(playList, newSong3);
//	    Song song = new Song("ともに", 206);
//	    Song newSong = new Song("負けないで", 264);
//        System.out.println("曲名: " + song.title + " / 再生時間: " + song.fixedPlayTime);
//        System.out.println("曲名: " + newSong.title + " / 再生時間: " + newSong.fixedPlayTime);
//        ArrayList<Song> playList = new ArrayList<Song>();
//        playList.add(song);
//        playList.add(newSong);
//
//        for(int i=0; i<playList.size(); i++) {
//            System.out.println(i + ": " + playList.get(i));
//        }
    }
}
