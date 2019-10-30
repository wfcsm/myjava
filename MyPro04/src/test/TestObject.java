package test;

public class TestObject {
    Object ob = new Object();

    public static void main(String[] args) {

        TestObject to = new TestObject();
        System.out.println(to.getClass().getName());
        System.out.println(to.toString());
    }
}
