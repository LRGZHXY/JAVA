package shiyan4;

public class StopWatch {
    // Data fields
    private long startTime;
    private long endTime;

    // No-arg constructor that initializes startTime with the current time
    public StopWatch() {
        this.startTime = System.currentTimeMillis();
    }

    // Getter method for startTime
    public long getStartTime() {
        return startTime;
    }

    // Getter method for endTime
    public long getEndTime() {
        return endTime;
    }

    // Method to reset the startTime to the current time
    public void start() {
        this.startTime = System.currentTimeMillis();
    }

    // Method to set the endTime to the current time
    public void stop() {
        this.endTime = System.currentTimeMillis();
    }

    // Method to get the elapsed time in milliseconds
    public long getElapsedTime() {
        return endTime - startTime;
    }
}
