package com.dotinstall.myapp.model;

public class User {
  // 他のパッケージに属するクラスからはアクセスできない
  protected String name;

  public User(String name) {
    this.name = name;
  }

  public void sayHi() {
    System.out.println("hi! " + this.name);
  }
}