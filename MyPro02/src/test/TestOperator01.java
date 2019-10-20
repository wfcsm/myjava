package test;

public class TestOperator01 {
    public static void main(String[] args){
        int a = 3;
        int b = a++;
        System.out.println(b);
        System.out.println(a);
        System.out.println("========");

        int c = 3;
        int d = ++c;
        System.out.println(d);
        System.out.println(a);
        System.out.println("========");

        byte e = 1;
        int f = 2;
        long b2 = 3;
        int e2 = e+e;
        float a1= 1;
        float c1=a1+b2;
        short a2=1;
        int c2 =a2+e;
        int c3 = e2+a2;

    }
}
