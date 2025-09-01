import java.util.concurrent.Callable;

public class ClockClass {
    public static void main(String[] args) {
        Clock clock = new Clock(); // the time is 12:00
        clock.next();
        System.out.println(clock);

    }
}

class Clock {

    int hours = 12;
    int minutes = 0;

    void next() {
        minutes ++;
        if (minutes == 60) {
            minutes = 0;
            hours ++;
        }

        if (hours == 13) {
            hours = 1;
        }
    }
}
