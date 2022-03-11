package com.company;

public class Main {

    public static void main(String[] args) {

        Balyk balyk = new Balyk();
        balyk.setName("Nemo");
        balyk.setAge(1);
        balyk.setColor("orange");
        balyk.setHostName("Marlin");
        System.out.println(balyk.getName() + " is " + balyk.getAge() + " years old. He is " + balyk.getColor() + " and his fathers name is " + balyk.getHostName() + ".");

        Popugay popugay = new Popugay();
        popugay.setName("Rio");
        popugay.setAge(2);
        popugay.setColor("blue");
        popugay.setHostName("Tulio");
        System.out.println(popugay.getHostName() + "'s " + popugay.getColor() + " " + popugay.getName() + " is " + popugay.getAge());

        Myshyk myshyk = new Myshyk();
        myshyk.setName("Тинклс");
        myshyk.setAge(5);
        myshyk.setColor("белый");
        myshyk.setHostName("бездомная кошка");

        It it = new It();
        it.setName("Бадди");
        it.setAge(4);
        it.setColor("коричневый");
        it.setHostName("бездомная собака");

        System.out.println("WANTED");
        System.out.println("HostName: " + myshyk.getHostName());
        System.out.println("name: " + myshyk.getName());
        System.out.println("Age: " + myshyk.getAge());
        System.out.println("Color: " + myshyk.getColor());


        System.out.println("HostName: " + it.getHostName());
        System.out.println("name: " + it.getName());
        System.out.println("Age: " + it.getAge());
        System.out.println("Color: " + it.getColor());


    }

}
