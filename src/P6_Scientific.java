/*
	ISYS 320
	Name(s):
	Date: 
*/



public class P6_Scientific {

	public static void main(String[] args) {
		
		computeScientificValue(6.5, 3);
		
	}
	public static void computeScientificValue(double base, double x) { 
		System.out.println(Math.pow(10, x) * base);
	}

}