package com.company;

public class Balyk {
    private String name;
    private int age;
    private String color;
    private String hostName;

    void setName(String balykName){
        name = balykName;
    }

    String getName(){
        return name;
    }

    void setAge(int age){
        this.age = age;
    }
    int getAge(){
        return age;
    }

    void setColor(String color){
        this.color = color;
    }
    String getColor(){
        return color;
    }

    void setHostName(String hostName){
        this.hostName = hostName;
    }
    String getHostName(){
        return hostName;
    }

}
