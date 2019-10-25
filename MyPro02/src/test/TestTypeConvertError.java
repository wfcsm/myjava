package test;

public class TestTypeConvertError {
    public static void main(String[] args) {
        int money = 1000000000;
        int years = 20;
        int total1 = money * years;
        System.out.println(total1);
        long total2 = money * years;
        System.out.println(total2);
        long total3 = (long) money * years;
        System.out.println(total3);
    }
}
