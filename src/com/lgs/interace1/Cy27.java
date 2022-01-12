package com.lgs.interace1;

public class Cy27 implements TOP {
    double maxSpeed;
    String color;

    public Cy27(double maxSpeed, String color) {
        this.maxSpeed = maxSpeed;
        this.color = color;
    }

    private Airplane_control Airplane_control = new Airplane_control();

    public void up(Double meters) {
        Airplane_control.up(meters);
    }

    public void down(Double meters) {
        Airplane_control.down(meters);
    }

    public void right(Double meters) {
        Airplane_control.right(meters);
    }

    public void left(Double meters) {
        Airplane_control.left(meters);
    }


    @Override
    public void TurboN20() {
        double turbo = (maxSpeed + (Math.random() * (1200 - 500) + 500));
        String result = String.format("%.1f", turbo);
        System.out.println("ВКЛ режим TURBO! Швидкість = " + result + " м/c");
    }

    @Override
    public void STELS() {
        double timeS = (Math.random() * (50 - 10) + 10);
        String result = String.format("%.2f", timeS);
        System.out.println("ВКЛ режим STELS на " + result + "sec");
    }

    @Override
    public void NuclerStrike() {
        double strikes = (Math.random() * (10 - 1) + 1);
        String result = String.format("%.0f", strikes);
        System.out.println("ЯДЕРНИЙ УДАР!");
        System.out.println("Скидання боєголовок! Боєголовок скинуто " +result + " шт");
    }
}


