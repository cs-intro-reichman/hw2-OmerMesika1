// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    // Version 1
		int n = Integer.parseInt(args[0]);
        String ch = args[1];
        boolean cv = ch.equals("v");
        int temp, steps;
        String line ="";
        for(int i=1;i<n+1;i++) {
            steps = 1;
            temp = i;
            if(temp==1) {
                temp = 4;
                line += 1 + " ";
                steps ++;
            }
            while(temp!=1) {
                steps ++;
                line += temp + " ";
                if(temp%2==0) {
                    temp = temp/2;
                } else {
                    temp = temp*3 + 1;
                }
            }
            line += "1 " + "(" + steps + ")";
            if(cv) {
            System.out.println(line);
            }
             line = "";
        }
        System.out.println("Every one of the first "+n+" hailstone sequences reached 1.");
	}
}
