package test;

public class Stu {
    int id;
    String name;
    int age;

    void study(){
        System.out.println("认真学习");
    }

    public static void main(String[] args) {
        Stu stu = new Stu();
        stu.study();
    }
}
