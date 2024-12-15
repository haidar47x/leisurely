package net.haidarali.myriad.models;

import java.util.ArrayList;

public class Task {

    private String name;
    private ArrayList<TimeSegment> timeSegments;

    public Task(String name) {
        this.name = name;
        this.timeSegments = new ArrayList<>();
    }

    public void addTimeSegment(TimeSegment timeSegment) {
        timeSegments.add(timeSegment);
    }

    public ArrayList<TimeSegment> getTimeSegments() {
        return timeSegments;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Task{" +
                "name='" + name + '\'' +
                ", timeSegments=" + timeSegments +
                '}';
    }
}
