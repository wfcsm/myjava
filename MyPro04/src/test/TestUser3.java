package test;

public class TestUser3 {
    int id;
    String name;
    String pwd;
    static String company;

//    静态块里面不能用普通方法和构造方法
    static {
        System.out.println("执行类的初始化");
        company="51公积金";
        printCompany();
    }
    public void aaa(){}
    public static void printCompany(){
        System.out.println(company);
    }

    public static void main(String[] args) {
        TestUser3 u3 = null;
    }

}
