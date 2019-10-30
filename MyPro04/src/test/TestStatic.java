package test;

public class TestStatic {
    int id;
    String name;
    String pwd;

    static String company = "company";
    public TestStatic(int id, String name){
        this.id = id;
        this.name = name;
    }
    public void login(){
        printCompany();//非静态方法，可以使用静态方法
        System.out.println(company);
        System.out.println("登录：" + name);
    }
    public static void printCompany(){
//        login();//静态方法里调用非静态的方法会报错
        System.out.println(company);
    }

    public static void main(String[] args) {
        TestStatic ts=new TestStatic(101,"qweqwe");
        TestStatic.printCompany();
        TestStatic.company = "51公积金";
        TestStatic.printCompany();

    }


}
