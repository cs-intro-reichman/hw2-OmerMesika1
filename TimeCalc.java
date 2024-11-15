public class TimeCalc {
    public static void main(String[] args) {
        // Replace this comment with your code
        String hinput = args[0];
        int addition = Integer.parseInt(args[1]);
        int sumin = Integer.parseInt(hinput.substring(0, 2))* 60 + Integer.parseInt(hinput.substring(3, 5)) + addition;
        int hours = (sumin/60) % 24;
        int minutes = sumin % 60;
        if (hours>=10) {
            if (minutes>=10) {
                System.out.println(hours + ":" + minutes); 
            } else {
                System.out.println(hours + ":" + "0"+minutes);
            }
        } else {
            if (minutes>=10) {
                System.out.println("0" + hours + ":" + minutes); 
            } else {
                System.out.println("0" + hours + ":" + "0"+minutes);
            }
        }
    }
}
