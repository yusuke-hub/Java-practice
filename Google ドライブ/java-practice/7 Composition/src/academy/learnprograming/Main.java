package academy.learnprograming;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 20, 5);

        Case theCase = new Case("220B", "Dell", "240", dimensions);

	    Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540, 1440));

	    Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");

	    PC thePC = new PC(theCase, theMonitor, theMotherboard);
	    thePC.powerUp();


        // 設計図を使って家の一室を作る。
        // その部屋に含まれるべきものを考えてみましょう。
        // たぶん家の物理的な部分だけでなく、家具も
        // getterとgetterを介してオブジェクトにアクセスするための少なくとも1つのメソッドを追加します。
        // 以前のビデオで見たように、そのオブジェクトのpublicメソッド
        // その後、getterを使用しないなど、オブジェクトを非表示にするための少なくとも1つのメソッドを追加します。
        // しかし、mainクラス内で合成に使用されるオブジェクトにアクセスするには
        // この動画で見たように

        Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("Eat");
        Wall wall3 = new Wall("South");
        Wall wall4 = new Wall("North");

        Ceiling ceiling = new Ceiling(12, 55);
        Bed bed = new Bed("Modern", 4, 3, 2, 1);
        Lamp lamp = new Lamp("Classic", false, 75);
        Bedroom bedRoom = new Bedroom("Tims", wall1, wall2, wall3, wall4, ceiling, bed, lamp);
        bedRoom.makeBed();

        bedRoom.getLamp().turnOn();



        // ●必要なオブジェクト
        // ★家house
        // ・パーツ
            // 屋根roof
            // ドアdoors
                // ノブknob   ロックlock
            // 床floor
            // 明かりlight
            // 窓ガラスwindowPane
            // バスタブbathTab
            // トイレtoilet

        // ・調度品
            // カーテンcurtain
        // ・家具furniture
            // 机desks
            // 椅子chairs
            // 時計clock
            // 服用の棚clothesRack
            // 本棚bookShelves
            // ベッドbed
        // ・電子機器
            // 洗濯機washingMachine
            // 冷蔵庫
            // 電子レンジ
            // オーブン
            // コンロ
            // ステレオ
            // テレビterevision
            // ドライヤー
            // 空気清浄機
            // エアコン
            // パソコン
            // 電話
            // コピー機

            //
        // ・部屋
            // 名前
            // 縦length
            // 横width
            // 高さheight
            // 畳数/床面積mat/flooarSpace = length * width
            // 容積volume = length * width * height
            // 机の数desk
            // 椅子の数chair
            // コンセント差し込み口の数outlet
            // 明かりの数light
                // 玄関Entrance
                // リビングlivingRoom
                // キッチンkitchen
                // 寝室bedRoom
                // 個室privateRoom
                // 風呂bathRoom
                // トイレrestRoom
                // ベランダveranda
                // 書斎aStudy
        //
     }
}
