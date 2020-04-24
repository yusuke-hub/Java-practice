package com.dotinstall.myapp;

// パッケージ名を毎回指定するのは、面倒なのでimport文を使う
import com.dotinstall.myapp.model.User;
import com.dotinstall.myapp.model.AdminUser;

public class MyApp {

  public static void main(String[] args) {
    User tom = new User("tom");
    // System.out.println(tom.name);
    tom.sayHi();

    AdminUser bob = new AdminUser("bob");
    // System.out.println(bob.name);
    bob.sayHi();
    bob.sayHello();
  }

}