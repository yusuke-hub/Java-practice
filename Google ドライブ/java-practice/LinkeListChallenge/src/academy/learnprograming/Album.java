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

import java.util.Scanner;
import java.util.LinkedList;
import java.util.ListIterator;


public class Album {
    LinkedList<Song> playList = new LinkedList<Song>();

    public static boolean add(LinkedList<Song> playList, Song newSong) {
        ListIterator<Song> playListIterator = playList.listIterator();

        while(playListIterator.hasNext()) {
            int comparison = playListIterator.next().compareTo(newSong);
            if(comparison == 0) {
                System.out.println("この曲は既にプレイリストに存在しています");
                return false;
            } else if(comparison > 0){
                return true;
            }
        }
        playListIterator.add(newSong);
        return true;
    }



    private static void play(LinkedList<Song> playList) {
        if(!playList.isEmpty()) {
            Scanner scanner = new Scanner(System.in);
            Boolean quit = false;
            Boolean goingForward = false;
            ListIterator<Song> playListIterator = playList.listIterator();

            if(playList.isEmpty()) {
                System.out.println("プレイリストには曲が存在しません");
                return;
            } else {
                System.out.println(playListIterator.next() + "を再生中");
                printMenu();
            }

            while(!quit) {
                int action = scanner.nextInt();
                scanner.nextLine();
                switch(action) {
                    case 0:
                        System.out.println("停止");
                        quit = true;
                        break;
                    case 1:
                        if(!goingForward) {
                            if(playListIterator.hasNext()) {
                                playListIterator.next();
                            }
                        }
                        if(playListIterator.hasNext()) {
                            System.out.println(playListIterator.next() +"を再生中");
                        } else {
                            System.out.println("このプレイリストで最後の曲");
                        }
                        break;
                    case 2:
                        if(goingForward) {
                            if(playListIterator.hasPrevious()) {
                                playListIterator.previous();
                            }
                        }
                        if(playListIterator.hasPrevious()) {
                            System.out.println(playListIterator.previous() + "を再生中");
                        } else {
                            System.out.println("このプレイリストで最初の曲");
                        }
                        break;
                    case 3:
                        displayPlayList(playList);
                        break;
                    case 4:
                        playListIterator.remove();
                        break;
                }
            }

        }
    }

    private static void displayPlayList(LinkedList<Song> playList) {
        for(int i=0; i < playList.size(); i++) {
            System.out.println(i + " - " + playList.get(i).title + " / " + playList.get(i).playingTime);
        }
    }

    private static void printMenu() {
        System.out.println("オプション一覧:\n" +
                "1 - 再生中の曲を停止\n" +
                "2 - 次の曲へスキップ\n" +
                "3 - 前の曲へスキップ\n" +
                "4 - プレイリストを表示");
    }
}
