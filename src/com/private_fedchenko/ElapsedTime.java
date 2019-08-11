package com.private_fedchenko;

public class ElapsedTime {
    private long startTime;
    private long endTime;
    private long elapsedTime;

    public ElapsedTime() {
    }

    public long getElapsedTime() {
        return elapsedTime;
    }

    public void saveStartTime(){
       startTime = System.nanoTime();
    }

    public void saveEndTime(){
       endTime = System.nanoTime();
    }

    public long measureElapsedTime(){
        elapsedTime = (endTime - startTime)/1000000;
        return elapsedTime;
    }
}
