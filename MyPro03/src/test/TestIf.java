package test;

public class TestIf {
    public static void main(String[] args){
        double d = Math.random();
        System.out.println(d);
        int a =(int)(6*d+1);
        if(a<7){
            System.out.println("垃圾公司:51公积金");
            System.out.println("陈志勇SB");
        }
        System.out.println("=========");
        int i=(int)(6*Math.random()+1);
        int j= (int) (6*Math.random()+1);
        int k = (int) (6*Math.random()+1);
        int total = i+j+k;
        if (total>=15){
            System.out.println("傻逼陈志勇");
        }
        if(total>10 && total<15){
            System.out.println("智障陈志勇");
        }
        if(total<=10){
            System.out.println("弱智陈志勇");
        }
    }
}
