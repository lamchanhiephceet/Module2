import java.time.LocalTime;
public class StopWatch {
    private LocalTime startTime;
    private LocalTime endTime;

    public LocalTime getStartTime(LocalTime startTime) {
        return startTime;
    }
    public LocalTime getEndTime(LocalTime endTime) {
        return endTime;
    }
    StopWatch() {
        startTime = LocalTime.now();
    }
    public void start() {
        this.startTime = LocalTime.now();
        getStartTime(startTime);
    }
    public void stop() {
        this.endTime = LocalTime.now();
        getEndTime(endTime);
    }
    public void getElapsedTime() {
        int ElapsedTime = (startTime.toSecondOfDay() - endTime.toSecondOfDay()*100);
        System.out.println("So mili giay dem duoc: " +ElapsedTime);
    }
    public static void sortSelect(long[] array) {
        for (long i = 0; i < array.length - 1; i++) {
            long minIndex = i;
            for (long j = i + 1; j < array.length; j++) {
                if (array[(int) j] < array[(int) minIndex]) {
                    minIndex = j;
                }
            }
            swap(array, i, minIndex);
        }
    }
    public static void swap(long[] array, long a, long b) {
        long temp = array[(int) a];
        array[(int) a] = array[(int) b];
        array[(int) b] = temp;
    }

    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        System.out.println("Dang dem thoi gian");
        for(int i=1;i<=100000;i++) {
        }
            stopWatch.stop();
            stopWatch.getElapsedTime();
    }
}
