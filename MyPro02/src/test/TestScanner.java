package test;

import java.util.Scanner;

public class TestScanner {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入名字：");
        String name = scanner.nextLine();



        System.out.println("请输入你的爱好:");
        String hobby = scanner.nextLine();

        System.out.println("请你的年龄：");
        int  age= scanner.nextInt();

        System.out.println("===============");
        System.out.println(name+","+hobby+","+age);

    }

}
