package com.enrollment.enrollmentproject;

public class ModelTable {
    String course, course_title, units, capacity, waitlist, room, professor;


    public ModelTable(String course, String course_title, String units, String capacity, String waitlist, String room, String professor) {
        this.course = course;
        this.course_title = course_title;
        this.units = units;
        this.capacity = capacity;
        this.waitlist = waitlist;
        this.room = room;
        this.professor = professor;
    }



    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getCourse_title() {
        return course_title;
    }

    public void setCourse_title(String course_title) {
        this.course_title = course_title;
    }

    public String getUnits() {
        return units;
    }

    public void setUnits(String units) {
        this.units = units;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public String getWaitlist() {
        return waitlist;
    }

    public void setWaitlist(String waitlist) {
        this.waitlist = waitlist;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }


}
