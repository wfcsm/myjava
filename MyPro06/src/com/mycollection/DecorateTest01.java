package com.mycollection;

public class DecorateTest01 {
    public static void main(String[] args) {
        Person p = new Person();
        Amplifier a = new Amplifier(p);
        a.say();
    }
}

//抽象组件
interface Say{
    void say();
}

//具体组件
class Person implements Say{
    private int voice = 10;
    public void say(){
         System.out.println(this.getVoice());
     }

    public int getVoice() {
        return voice;
    }

    public void setVoice(int voice) {
        this.voice = voice;
    }
}

//抽象装饰类
class Amplifier implements Say{
    private Person p;
    public Amplifier(Person p){
        this.p = p;
    }

    public void say(){
        System.out.println(p.getVoice()*100);
    }
}
