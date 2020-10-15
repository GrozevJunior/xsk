package com.sap.xsk.xscjob.ds.tronsformer;

public class QuartzCronExpression {
    private String seconds;
    private String minutes;
    private String hours;
    private String dayOfMonth;
    private String month;
    private String dayOfWeek;
    private String year;

    public QuartzCronExpression() {
    }

    public String getSeconds() {
        return seconds;
    }

    public void setSeconds(String seconds) {
        this.seconds = seconds;
    }

    public String getMinutes() {
        return minutes;
    }

    public void setMinutes(String minutes) {
        this.minutes = minutes;
    }

    public String getHours() {
        return hours;
    }

    public void setHours(String hours) {
        this.hours = hours;
    }

    public String getDayOfMonth() {
        return dayOfMonth;
    }

    public void setDayOfMonth(String dayOfMonth) {
        this.dayOfMonth = dayOfMonth;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Override
    public String toString() {
        StringBuilder cronExpression = new StringBuilder();
        cronExpression.append(seconds + " ");
        cronExpression.append(minutes + " ");
        cronExpression.append(hours + " ");
        cronExpression.append(dayOfMonth + " ");
        cronExpression.append(month + " ");
        cronExpression.append(dayOfWeek + " ");
        cronExpression.append(year);

        return cronExpression.toString();
    }
}
