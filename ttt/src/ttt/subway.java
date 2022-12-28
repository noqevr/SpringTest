package ttt;

import java.util.logging.Logger;

public class subway {
	Logger logger = Logger.getLogger("me");
	int subnum;
	int passconunt;
	int money;


	public subway(int subnum) {
		this.subnum=subnum;
	}
	public void take(int money) {
		this.money += money;
		passconunt++;
	}


	public void showbusinfo() {
		System.out.println(subnum+"번의 승객수"+passconunt+"명이고 수입은"+money);
	 }
}
