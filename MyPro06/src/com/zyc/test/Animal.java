package com.zyc.test;

public abstract class Animal {
      public abstract void shot();
}

class Dog extends Animal{

    @Override
    public void shot() {
        System.out.println("汪汪汪");
    }
}