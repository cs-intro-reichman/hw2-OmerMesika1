// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    // Replace this comment with your code
		int nchecks = Integer.parseInt(args[0]);
		double res = 1;
		int denominator = 3;
		double temp =(double)-1/denominator;
		int sign = 1;
		for(int i=0;i<nchecks-1;i++) {
			res+=temp;
			denominator = denominator+2;
			temp = (double) 1/denominator;
			temp = (double)sign*temp;
			sign = -sign;
		}
		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated:     " + 4*res);
	}
}
