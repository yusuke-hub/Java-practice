package academy.learnprograming;

public class Main {

    public static void main(String[] args) {
        // Q1:要素数0の配列を作り、存在しない一番目の要素として値10を代入しようとしている
        // ArrayIndexOutOfBoundsException
//        try {
//            int[] array = {};
//            array[0] = 10;
//            System.out.println("finish");
//        } catch(ArrayIndexOutOfBoundsException e) {
//            System.out.println("error");
//        }

        System.out.println(test(null));
    }
    // returnによって呼び出し元のメソッドに制御が戻る前に、
    // finallyブロックは必ず実行される。
    // NullPointerExceptionが発生し、対応するcatchブロックでは、
    // 何の処理もせずreturnによって呼び出し元であるmainメソッドに値を戻そうとするが、
    // finallyブロックでBが表示されてから制御が戻る
    private static String test(Object obj) {
        try {
            System.out.println(obj.toString());
        } catch(NullPointerException e) {
            return "A";
        } finally {
            System.out.println("B");
        }
        return "C";
    }
}
