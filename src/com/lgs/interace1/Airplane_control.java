package com.lgs.interace1;

public class Airplane_control {

    public void up(double a) {
        double meters = Math.random() * (200 - 20) + 20;
        String result= String.format("%.2f",meters);
        System.out.println("Airplane is moving UP on " + result + " kilometers");
    }

    public void down(double b) {
        double meters = Math.random() * (200 - 20) + 20;
        String result= String.format("%.2f",meters);
        System.out.println("Airplane is moving DOWN on " + result + " kilometers");
    }

    public void right(double c) {
        double meters = Math.random() * (200 - 20) + 20;
        String result= String.format("%.2f",meters);
        System.out.println("Airplane is moving RIGHT on " + result + " kilometers");
    }

    public void left(double d) {
        double meters = Math.random() * (200 - 20) + 20;
        String result= String.format("%.2f",meters);
        System.out.println("Airplane is moving LEFT on " + result + " kilometers");
    }


}
