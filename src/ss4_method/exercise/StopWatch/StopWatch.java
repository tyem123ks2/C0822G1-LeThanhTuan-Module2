package ss4_method.exercise.StopWatch;

import java.time.LocalTime;

public class StopWatch {
    private LocalTime startTime;
    private LocalTime endTime;

    public LocalTime getStartTime(LocalTime startTime) {
        return startTime;
    }

    public LocalTime getEndTime(LocalTime startTime) {
        return endTime;
    }
    StopWatch () {
        startTime = LocalTime.now();
    }
    public void start() {
        this.startTime = LocalTime.now();
        getStartTime(startTime);
    }
    public void stop() {
        this.endTime = LocalTime.now();
        getStartTime(endTime);
    }
    public void getElapsedTime () {
        int ElapsedTime = (startTime.toSecondOfDay() - endTime.toSecondOfDay()) * 100;
        System.out.println("Thời gian đã trôi qua theo milisecond giây là: " + ElapsedTime);
    }
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        System.out.println("Đang đếm thời gian");
        for (int i = 1; 1 <= 1000000; i++)
            stopWatch.stop();
    }

}
