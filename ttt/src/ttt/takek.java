package ttt;

public class takek {

	public static void main(String[] args) {
		student stu = new student("jame",5000);
		Bus b= new Bus(100);
		subway  s = new subway(236);
		
		stu.takebus(b);
		
		stu.takeSubway(s);
		
		stu.showInfo();
		b.showbusinfo();
		s.showbusinfo();
		
		System.out.println();
	}

}
