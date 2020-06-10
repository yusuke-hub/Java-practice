// ボブは壁のペンキ塗りをしています、あなたの助けが必要です。
// あなたはボブが仕事に行く前にペンキのバケツを何個買う必要があるかを計算するのに役立つプログラムを書かなければなりません。
// ボブはまた、自宅にいくつかの余分なバケツを持っているかもしれません。
// 彼はまた、彼が1つのバケツの塗料でカバーできる領域を知っています。

// 1. 4つのパラメータを持つ getBucketCount という名前のメソッドを書きます。
    // 最初のパラメータは double 型の width という名前にします。
        // このパラメータは壁の幅を表します。

    // 2番目のパラメータは、ダブル型の高さを指定します。
        // このパラメータは壁の高さを表します。
    // 3番目のパラメータは areaPerBucket と名付けます。
        // このパラメータは1つのバケツで塗れる面積を表します。

    // 4番目のパラメータは extraBuckets とします。
        // このパラメータは、ボブが家に持っているバケツの数を表します。
        // このメソッドは int 型の値を返す必要がありますが、
        // これは Bobが出勤する前に購入する必要があるバケツの数を表します。
        // バケット数を計算するには、以下の注意事項を参照してください。

    // パラメータ width、height、areaPerBucketのいずれかが0以下の場合
    // またはextraBucketsが0以下の場合、
        // メソッドは -1 を返して無効な値を示す必要があります。

    // すべてのパラメータが有効な場合、
        // メソッドはバケットの数を計算してそれを返す必要があります。

//入出力の例。
    //*width パラメータが無効なので、-1 を返す必要があります。
    //*getBucketCount(3.4, 2.1, 1.5, 2);
        // 壁の面積は7.14、バケツ1つで1.5の面積をカバーでき、ボブは2つの余分なバケツを家に持っているので、
            // →は3を返すべきです。

    //*getBucketCount(2.75, 3.25, 2.5, 1);
        // 壁の面積が8.9375で、バケツ1つで2.5の面積をカバーでき、ボブは家に1つ余分なバケツを持っているので、
            // →は3を返すべきです。

// 2. BobはextraBucketsパラメータに0を入力するのを嫌がるので、別のメソッドが必要です。

//3つのパラメータ（width、height、areaPerBucket（すべてdouble型））を持つ
// getBucketCountという別のオーバーロードされたメソッドを書きます。
    // このメソッドは int 型の値を返す必要がありますが、これはBobが出勤する前に購入しなければならないバケツの数を表します。

    // バケット数を計算するには、以下の注意事項を参照してください。
    // パラメータ width、height、areaPerBucket のいずれかが0以下の場合は、
        // 無効な値を示すために -1 を返す必要があります。
    //すべてのパラメータが有効な場合、
        // メソッドはバケット数を計算してそれを返す必要があります。

//入出力の例。
    //*getBucketCount(-3.4, 2.1, 1.5);
        // widthパラメータが無効なので、
            // -1を返す必要があります。
    //*getBucketCount(3.4, 2.1, 1.5)
        // 壁の面積は7.14で、バケツ1つで1.5の面積をカバーできるので、
            // 5を返します。
    //*getBucketCount(7.25, 4.3, 2.35);
        // →壁の面積が31.175で、バケツ1つで2.35の面積をカバーできるので、
            // 14を返す。

// 3. ボブは壁の幅や高さは知らないが、壁の面積は知っている場合もある。
// 彼はあなたに別のメソッドを書いてもらう必要があります。

// 2つのパラメータ、すなわちareaとareaPerBucket（両方ともdouble型）を持つ
// getBucketCountというオーバーロードされた別のメソッドを書いてください。

//このメソッドは、ボブが出勤する前に購入するバケットの数を表すint 型の値を返す必要があります。

// バケット数を計算するには、以下の注意事項を参照してください。
    // パラメータareaまたはareaPerBucketのいずれかが0以下の場合、
        // メソッドは-1を返して無効な値を示します。
    // すべてのパラメータが有効な場合、
        // メソッドはバケット数を計算してそれを返す必要があります。

//入出力の例。

//* getBucketCount(3.4, 1.5)
    // 面積が3.4で、1つのバケットで1.5の面積をカバーできるので、
        // 3を返します。

//*getBucketCount(6.26, 2.2);
    // 壁の面積が6.26で、バケツ1つで2.2の面積をカバーできるので、
        // →は3を返す。

//*getBucketCount(3.26, 0.75);
    // →壁の面積が3.26で、バケツ1つで0.75の面積をカバーできるので、
        // 5を返すべきです。

// ボブを助けるために最善を尽くしてください。

//注意: Math.ceil メソッドを使用して、計算されたバケツの数（double）を切り捨てをしてから、
// メソッドから値を返す前に int に変換してください。
//注意: すべてのメソッドは、これまでのコースで行ってきたように、public staticとして定義してください。
//注意: 解答コードにメインメソッドを追加しないでください。

package academy.learnprograming;

public class Main {

    public static void main(String[] args) {
        System.out.println(getBucketCount(0.0, 2.1, 1.5, 7));

        System.out.println(getBucketCount(-3.4,2.1, 1.5, 2));
        System.out.println(getBucketCount(3.4,2.1, 1.5, 2));
        System.out.println(getBucketCount(2.75, 3.25, 2.5, 1));
        System.out.println("");
        System.out.println(getBucketCount(-3.4, 2.1, 1.5));
        System.out.println(getBucketCount(3.4, 2.1, 1.5));
        System.out.println(getBucketCount(7.25, 4.3, 2.35));
        System.out.println("");
        System.out.println(getBucketCount(3.4, 1.5));
        System.out.println(getBucketCount(6.26, 2.2));
        System.out.println(getBucketCount(3.26, 0.75));
    }
//    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
//        if(width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
//            return -1;
//        } else {
//            double area = width * height;
//            double areaCanPaint = areaPerBucket * extraBuckets;
//            int willGetBucketNumber = (int) Math.ceil((area - areaCanPaint) / areaPerBucket);
//            return willGetBucketNumber;
//        }
//    }
//    public static int getBucketCount(double width, double height, double areaPerBucket) {
//        if(width <= 0 || height <= 0 || areaPerBucket <= 0) {
//            return -1;
//        } else {
//            double area = width * height;
//            int willGetBucketNumber = (int) Math.ceil(area / areaPerBucket);
//            return willGetBucketNumber;
//        }
//    }
//    public static int getBucketCount(double area, double areaPerBucket) {
//        if(area <= 0 || areaPerBucket <= 0) {
//            return -1;
//        } else {
//            int willGetBucketNumber = (int) Math.ceil(area / areaPerBucket);
//            return willGetBucketNumber;
//        }
//    }
public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){
    return (width<=0 || height<=0 || areaPerBucket<=0 || extraBuckets<0) ? -1 : (int) Math.ceil((width*height-(areaPerBucket*extraBuckets))/ areaPerBucket);
}

    public static int getBucketCount(double width, double height, double areaPerBucket){
        return (width<=0 || height<=0 || areaPerBucket<=0) ? -1 : (int) Math.ceil(width*height/areaPerBucket);
    }

    public static int getBucketCount(double area, double areaPerBucket){
        return (area<=0 || areaPerBucket<=0) ? -1 : (int) Math.ceil(area/areaPerBucket);
    }
}
