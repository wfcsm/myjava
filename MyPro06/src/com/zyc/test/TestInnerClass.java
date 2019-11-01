package com.zyc.test;

public class TestInnerClass {
    public static void main(String[] args) {
        Outer.Inner inner = new Outer.Inner();
        inner.show();
    }

}

class Outer{
    private  int age = 10;

    public int getAge() {
        return age;
    }

    public void testOuter(){}

    static class Inner {
        int age = 20;
        public void show(){
            int age = 30;
            Outer outer=new Outer();
            System.out.println(outer.getAge());
            System.out.println(this.age);
            System.out.println(age);
            String a ="sd";
            a.equals("sads");
        }
    }
}
