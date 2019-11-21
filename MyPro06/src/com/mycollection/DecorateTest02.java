package com.mycollection;

//1
public class DecorateTest02 {
    public static void main(String[] args) {
        Drink coffee = new Coffee();
        Drink milk = new Milk(coffee);
        System.out.println(coffee.info());
        System.out.println(milk.info());
    }
}

//抽象组件
interface Drink{
    double cost();
    String info();
}
//具体组件
class Coffee implements Drink{
    private String name = "原味咖啡";

    @Override
    public double cost() {
        return 10;
    }

    @Override
    public String info() {
        return name;
    }
}


//抽象装饰类
abstract class Decorate implements Drink {

    private Drink drink;

    public Decorate(Drink drink) {
        this.drink = drink;
    }

    @Override
    public double cost() {
        return this.drink.cost();
    }

    @Override
    public String info() {
        return this.drink.info();
    }
}


//具体装饰类
class Milk extends Decorate{

    public Milk(Drink drink) {
        super(drink);
    }

    @Override
    public double cost() {
        return super.cost()*10;
    }

    @Override
    public String info() {
        return super.info()+"加了牛奶";
    }
}

