
package relogio;

public class Relogio {
    
    public static void main(String[] args) {
        ClockDisplay display = new ClockDisplay("PM");  // AM or PM
        for(int i = 0; i<3600*12; i++){
            display.timeTick();
        }
        System.out.println(display.getTime());
    }
    
}
