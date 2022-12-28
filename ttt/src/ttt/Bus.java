package ttt;

public class Bus {
int busnum;
int passconunt;
int money;


public Bus(int busnum) {
	this.busnum=busnum;
}
public void take(int money) {
	this.money += money;
	passconunt++;
}


public void showbusinfo() {
	System.out.println(busnum+"번의 승객수"+passconunt+"명이고 수입은"+money);
 }
}
