// クラスを作成し、適切なカプセル化技術を実証する。
// クラスはPrinterと呼ばれるようになります。
// それは実際のコンピュータプリンタをシミュレートします。
// トナーレベル、印刷されたページ数、および両面印刷が可能な両面プリンターかどうかのフィールドを持つ必要があります。
// トナーを満タンにする方法（最大１００％まで）、ページの印刷をシミュレートする別の方法（印刷されるページ数を増やすべき）を追加します。
// スコープ、コンストラクタを使うかどうか、その他必要だと思うことは何でも決めましょう。
package academy.learnprograming;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        if(tonerLevel >-1 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }
        this.duplex = duplex;
        this.pagesPrinted = 0;
    }

    public int addToner(int tonerAmount) {
        if(tonerAmount >0 && tonerAmount <=100) {
            if(this.tonerLevel + tonerAmount >100) {
                return -1;
            }
            this.tonerLevel += tonerAmount;
            return this.tonerLevel;
        } else {
            return -1;
        }
    }

    public int printPages(int pages) {
        int pagesToPrint = pages;
        if(this.duplex) {
            pagesToPrint /= 2;
            System.out.println("Printing in duplex mode");
        }
        this.pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    //    ★ My Code
//    private int tonerLevel;
//    private int numberOfPages;
//    private boolean isDuplex;
//
//    public Printer(int tonerLevel, int numberOfPages, boolean isDuplex) {
//        this.tonerLevel = tonerLevel;
//        this.numberOfPages = numberOfPages;
//        this.isDuplex = false;
//    }
//
//    public int getTonerLevel() {
//        return tonerLevel;
//    }
//
//    public int getNumberOfPages() {
//        return numberOfPages;
//    }
//
//    public boolean isDuplex() {
//        return isDuplex;
//    }
//
//    public void  fillUp(int toner) {
//        while(tonerLevel <100) {
//            tonerLevel += toner;
//            System.out.println(tonerLevel);
//        }
//        System.out.println("トナーは100%になりました");
//    }
//    public void simulate(int numberOfPages, boolean isDuplex) {
//        this.numberOfPages = numberOfPages;
//        if(isDuplex) {
//            this.isDuplex = isDuplex;
//        } else {}
//    }
}
