package OOPLopVaDoiTuongTrongJAVA;

import javafx.scene.paint.Stop;

import java.time.LocalTime;

public class StopWatch {
    private LocalTime starTime, endTime;

    public StopWatch() {
        starTime = LocalTime.now();
    }

    public StopWatch(LocalTime starTime, LocalTime endTime) {
        this.starTime = starTime;
        this.endTime = endTime;
    }

    public LocalTime getStarTime() {
        return starTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void start() {
        starTime = LocalTime.now();
    }

    public void stop() {
        endTime = LocalTime.now();
    }

    public double getElapsedTime() {
        return ((endTime.getHour() - starTime.getHour()) * 3600 + (endTime.getMinute() - starTime.getMinute()) * 60 + (endTime.getSecond() - starTime.getSecond())) * 1000;
    }

    public static long[] selectionSort(long[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    long temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        long[] array = new long[100000];
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.round(Math.random() * 1000);
        }
        LocalTime start = LocalTime.now();
        selectionSort(array);
        LocalTime stop = LocalTime.now();
        StopWatch stopwatch = new StopWatch(start, stop);
        System.out.println("Time: " + stopwatch.getElapsedTime());
    }
}
