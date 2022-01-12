package com.lgs.interace1;

public class Main {

    public static void main(String[] args) {
	Cy27 Cy27 = new Cy27(1200,"White");
	Airplane.start(Math.random() * (88 - 20) + 20);
	Airplane.rise (Math.random() * (1000 - 200) + 200);
	Cy27.up(Math.random());
	Cy27.down(Math.random());
	Cy27.right(Math.random());
	Cy27.left(Math.random());
	Cy27.STELS();
	Cy27.NuclerStrike();
	Cy27.TurboN20();
	Airplane.landing();



    }
}
