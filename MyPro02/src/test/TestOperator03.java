package test;

public class TestOperator03 {
    public static void main(String[] args){
        int score = 80;
        String type = score<80 ? "不及格" : "及格";
        System.out.println(type);
        int x = -100;
        System.out.println(x>0?1:(x==0?0:-1));
        short a =12345;
    }
}
