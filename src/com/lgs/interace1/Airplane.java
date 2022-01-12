package com.lgs.interace1;

public abstract class Airplane {
    double weight;
    double height;
    double mass;


    public Airplane(double weight, double height, double mass) {
        this.weight = weight;
        this.height = height;
        this.mass = mass;
    }


    public static void start(double v) {
        double seconds = Math.random() * (88 - 20) + 20;
        String second = String.format("%.2f", seconds);
        System.out.println("Запуск двигуна!");
        System.out.println("Взліт через  " + second + " секунд");
    }

    public static void rise(double k) {
        double kilometers = Math.random() * (1000 - 2) + 2;
        String kilometer = String.format("%.2f", kilometers);
        System.out.println("Запас ходу = " + kilometer + " кілометрів");
    }

    public static void landing() {
        System.out.println("Літак прибув до місця приземлення!");
        System.out.println("Літак йде на посадку!");
    }
}
