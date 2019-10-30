package test;

public class Stu {
    int id;
    String name;
    int age;

    Computer comp;

    void study(){
        System.out.println("认真学习!!"+comp.brand);
    }
    //构造方法。用于创建这个类的对象。无参的构造方法可以由系统自动创建
    Stu(){}
    public static void main(String[] args) {
        Stu stu = new Stu();
        stu.id=1001;
        stu.name="水电费";
        stu.age=19;
        Computer c1 = new Computer();
        c1.brand="苹果";
        stu.comp=c1;
        stu.study();

    }
}

class Computer{
    String brand;
}
