package com.company;

public class Test {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {


        if (name== "suraj"){
            System.out.println("We cannot show your Name");


            this.name = "Hidden";
        }
        else {
            this.name = name;


        }
    }

    public int getAge() {
        return age;
    }



    public void setAge(int age) {


            this.age = age;



    }
}
