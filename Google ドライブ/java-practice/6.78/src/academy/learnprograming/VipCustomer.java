package academy.learnprograming;
// 新しいクラス VipCustomer を作成します。
// 名前、与信限度額、メールアドレスの3つのフィールドを持つ必要があります。
// 3つのコンストラクタを作成します。
// 1 番目のコンストラクタが空の場合は、デフォルト値で 3 つのパラメータを持つコンストラクタを呼び出す必要があります。
// 2 番目のコンストラクタでは、受け取った 2 つの値を渡して 3 番目のデフォルト値を追加します。
// 3番目のコンストラクタは全てのフィールドを保存しなければなりません。
// セッターは必要ないので、intellijのコード生成を使用して、
// このためだけにゲッターを作成します。
// テストして動作を確認します。

public class VipCustomer {
    private String name;
    private double creditLimit;
    private String emailAddress;

    public VipCustomer() {
        this("Default name", 50000.00, "default@email.com");
    }

    public VipCustomer(String name, double creditLimit) {
        this.name = name;
        this.creditLimit = creditLimit;
    }
    public VipCustomer(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
