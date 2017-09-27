/*
	ISYS 320
	Name(s):
	Date: 
*/

/*
 What were the errors you found?
 The println was in the main method and once it called the "tempc" statement it printed what the double declared tempc as instead of running completely through the formula. 
 
 */

public class P4_FixTempConverter {
	public static void main(String[] args) {
		double tempf = 98.6;
		double tempc = 0.0;
		ftoc(tempf, tempc);
		
	}

	// converts Fahrenheit temperatures to Celsius
	public static void ftoc(double tempf, double tempc) {
	      tempc = (tempf - 32) * 5 / 9;
	      System.out.println("Body temp in C is: " + tempc);
    }
}
