package Bai2_StopWatch;

public class Bai2 {
    public static void main(String[] args) {
        StopWatch clock = new StopWatch();
        clock.start();
        System.out.println(clock.getStart());
        clock.end();
        System.out.println(clock.getEnd());
        clock.Stop();
    }
}
