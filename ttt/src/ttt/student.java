package ttt;

public class student {
	String studentname;
	int money;
	
	
	public student(String student, int money) {
		this.studentname=studentname;
		this.money=money;
		
	}
	
	public void takebus(Bus bus) {
		bus.take(1000);
		this.money -= 1000;
	}
	
	public void takeSubway(subway subway) {
		subway.take(1200);
		this.money -= 1200;
	}
	
	public void showInfo() {
		System.out.println(studentname+"³²Àºµ·Àº"+money);
	}
	public static void main(String[] args) {
		
	}

}
