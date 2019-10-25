package test;

public class TestIfElse {

    public static void main(String[ ] args){
       int r= (int) (6* Math.random());
       int area = (int) (Math.PI * Math.pow(r,2));
       int circle = (int) (2*Math.PI*r);
       System.out.println(area);
       System.out.println(circle);
       int a=1;
       int b =a++;
       System.out.println(b);

    }
}

