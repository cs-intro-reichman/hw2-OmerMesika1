// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    // Version 1
            String name = args[0];
            int times = Integer.parseInt(args[1]);
            String checkletters = "AaEeFfHhIiLlMmNnOoRrSsXx";
            boolean checkoutput=false;
            for (int i=0;i<name.length();i++) {
                for(int n=0;n<checkletters.length();n++) {
                   if (checkletters.charAt(n)==name.charAt(i)) {
                        checkoutput=true;
                   }    
                }
                if (checkoutput) {
                        System.out.println("Give me an " + name.charAt(i)+"!");
                   } else {
                        System.out.println("Give me a  " + name.charAt(i) + "!"); 
                   } 
                   checkoutput=false;
            }
            System.out.println("What does that spell?");
            for(int x=0;x<times;x++){
                System.out.println(name+"!!!");
            }
        }
}
