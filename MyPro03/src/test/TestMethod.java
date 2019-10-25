package test;

public class TestMethod {
    public static void main(String[] args) {
        TestMethod tm = new TestMethod();
        tm.printM();
        int c =tm.add(30,40,50)+1000;
        System.out.println(c);
    }
    void printM(){
        System.out.println("方法");
    }
    int add(int a, int b, int c){
        int sum = a+b+c;
        System.out.println(sum);
        return sum;
    }
//    double add(int a,int b, int c){
//        double sum = a+b+c;
//        System.out.println(sum);
//        return sum;
//    }


}
