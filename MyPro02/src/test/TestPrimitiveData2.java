package test;

import java.math.BigDecimal;

public class TestPrimitiveData2 {
    public static void main(String[] args){
        float a = 3.14F;
        double b = 6.28E2;
        double c = 6.28E-2;
        System.out.println(b);
        System.out.println(c);
        System.out.println("=======");

        float f = 0.1f;
        double d = 1.0/10;
        System.out.println(f);
        System.out.println(d);
        System.out.println(f==d);
        System.out.println("=======");

        BigDecimal bd = BigDecimal.valueOf(1.0);
        bd = bd.subtract(BigDecimal.valueOf(0.1));
        bd = bd.subtract(BigDecimal.valueOf(0.1));
        bd = bd.subtract(BigDecimal.valueOf(0.1));
        bd = bd.subtract(BigDecimal.valueOf(0.1));
        bd = bd.subtract(BigDecimal.valueOf(0.1));
        System.out.println(bd);
        System.out.println(1.0-0.1-0.1-0.1-0.1-0.1);
    }
}
