package ttt;

public class dfe {
	
	public static int add(int num1, int num2) {
		int result;
		result=num1 + num2;
		return result;
		
		
	}
	
	public static String std(String m, String n) {
		
		String res;
		res=m+n;
		return res;
		
	}
	
	public static void main(String[] args) {
	
		int n1 = 10;
		int n2 = 20;
		
		int total=add(n1,n2);
		System.out.println(total);
		
		
		String h = "½Ã¹ß";
		String n = " wlfkf";
		
		String g = std(h,n);
		
		System.out.println(g);
		
		
		
	}

}
