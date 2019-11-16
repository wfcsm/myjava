package com.mycollection;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.List;

public class TestStoreData2 {
    public static void main(String[] args) {
        User user1 = new User(1001,"张三",2000,"2018.5.5");
        User user2 = new User(1002,"张三",3000,"2018.5.6");
        User user3 = new User(1003,"张三",4000,"2018.5.7");

        List<User> list = new ArrayList<>();
        list.add(user1);
        list.add(user2);
        list.add(user3);
        for(User u:list){
            System.out.println(u);
        }
    }

}

class User{
    private int id;
    private String name;
    private double salary;
    private String hiredate;

    public User() {
    }

    public User(int id, String name, double salary, String hiredate) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.hiredate = hiredate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getHiredate() {
        return hiredate;
    }

    public void setHiredate(String hiredate) {
        this.hiredate = hiredate;
    }

    @Override
    public String toString() {
        return "id:"+id+",name:"+name;
    }
}

