package controller;

import java.util.Date;

public class Time {
    long start, end;
    public void start(){
       this.start=getActualMilliseconds();
    }
    public void end(){
        this.end=getActualMilliseconds();
    }
    private long getActualMilliseconds(){
        Date date = new Date();
        return date.getTime();
    }
    public long elapsedTime(){
        return this.end-this.start;
    }
}
