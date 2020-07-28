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

public class Song {
    String title;
    String fixedPlayTime;
    int fixingPlayTime;

    public Song(String title, int playingTime) {
        this.title = title;
        this.fixingPlayTime = playingTime;
        this.fixedPlayTime = fixingPlayTime / 60 + ":" + fixingPlayTime % 60;
    }

    public String getTitle() {
        return title;
    }

    public String getFixedPlayTime() {
        return fixedPlayTime;
    }

    public int getFixingPlayTime() {
        return fixingPlayTime;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setFixedPlayTime(String fixedPlayTime) {
        this.fixedPlayTime = fixedPlayTime;
    }

    public void setFixingPlayTime(int fixingPlayTime) {
        this.fixingPlayTime = fixingPlayTime;
    }

    public int compareTo(Song newSong) {
        if(this.equals(newSong)) {
            return 0;
        } else {
            return 1;
        }
    }
}
