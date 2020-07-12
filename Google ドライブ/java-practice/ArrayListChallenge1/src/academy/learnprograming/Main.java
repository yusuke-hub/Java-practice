package academy.learnprograming;

// 以下のような機能を持つシンプルな携帯電話を実装するプログラムを作成します。
    // 連絡先の名前の保存、
    // 変更、
    // 削除、
    // 問い合わせが可能です。
// 連絡先(名前と電話番号)のためのクラスを別途作成したいと思います。
// 連絡先のArrayListを保持するマスタークラス(MobilePhone)を作成します。
// MobilePhoneクラスは、上記の機能を持っています。

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

// 利用可能なオプションのメニューを追加します。
// オプションです。
    // 終了、連絡先リストの印刷、
    // 新しい連絡先の追加、
    // 既存の連絡先の更新、
    // 連絡先の削除
    // をクリックして、連絡先を検索/検索します。
        // 連絡先を追加または更新する際には、連絡先が既に存在するかどうかを確認してください（名前を使用してください）。
// Arraylistの内部構造をMobilePhoneに公開しないように注意してください。
    // 例: intsなし、.get(i)なしなど
// MobilePhoneはContactオブジェクトのみですべてを行う必要があります。
public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone2 mobilePhone = new MobilePhone2("0039 330 4404");
//    private static contactInfoList contactInfoLists = new contactInfoList();

    public static void main(String[] args) {

//        boolean quit = false;
//        int choice = 0;
//
//        printInstructions();
//        while (!quit) {
//            System.out.println("以下の番号から、実行する操作を選んでください");
//            choice = scanner.nextInt();
//            switch (choice) {
//                case 0:
//                    contactInfoLists.
//
//            }
//        }
        boolean quit = false;
        startPhone();
        printActions();
        while(!quit) {
            System.out.println("\nEnter action: (6 to show available actions");
            int action = scanner.nextInt();

            switch (action) {
                case 0:
                    System.out.println("\nShutting down...");
                    quit = true;
                    break;
                case 1:
                    mobilePhone.printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printActions();
                    break;
            }
        }
    }

    private static void addNewContact() {
        System.out.println("Enter new contact name: ");
        String name = scanner.nextLine();
        System.out.println("Enter phone number: ");
        String phone = scanner.nextLine();
        Contact newContact = Contact.createContact(name, phone);
        if(mobilePhone.addNewContact(newContact)) {
            System.out.println("New contact added: name = " + ", phone = " + phone);
        } else {
            System.out.println("Cannot add, " + name + " already on file");
        }
    }

    private static updateContact() {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if(existingContactRecord == null) {
            System.out.println("Contact not found,");
            return;
        }

        System.out.println("Enter new contact name");
        String newName = scanner.nextLine();
        System.out.println("Enter new contact phone number: ");
        String newNumber = scanner.nextLine();
        Contact newContact = Contact.createContact(newName, newNumber);
        if(mobilePhone.updateContact(existingContactRecord, newContact)) {
            System.out.println("Successfully updated record");
        } else {
            System.out.println("Error updating record.");
        }
    }

    private static void printContacts() {
        mobilePhone.printContacts();
    }

    private static void startPhone() {
        System.out.println("Starting phone...");
    }

    private static void printActions() {
        System.out.println("\nAvailable actions:\npress");
        System.out.println( "0 - to shutdown\n" +
                            "1 - to print contacts\n" +
                            "2 - to add a new contact\n" +
                            "3 - to update existing an existing contact\n" +
                            "4 - to remove an existing contact\n" +
                            "5 - query if an existing contact exists\n" +
                            "6 - to print a list of available actions.");
        System.out.println("Choose your action: ");
    }


//    public static void printInstructions() {
//        System.out.println("\nPress");
//        System.out.println("\t 0 - 操作の選択肢を表示する");
//        System.out.println("\t 1 - 連絡先リストを表示する");
//        System.out.println("\t 2 - 連絡先を追加する");
//        System.out.println("\t 3 - 連絡先を修正する");
//        System.out.println("\t 4 - 連絡先を削除する");
//        System.out.println("\t 5 - 連絡先を検索する");
//        System.out.println("\t 6 - 操作を中断する");
//    }
//
//    public void addInfo(MobilePhone ) {
//        System.out.println("連絡先を追加してください");
//        contactInfoLists.registerContactInfo();
//    }
}
