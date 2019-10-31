package ua.lviv.iot.model;

import java.sql.Date;

public class Film {
    String title;
    Integer runningTime;
    Date releaseDate;

    public Film(String title, Integer runningTime, Date releaseDate) {
        this.title = title;
        this.runningTime = runningTime;
        this.releaseDate = releaseDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getRunningTime() {
        return runningTime;
    }

    public void setRunningTime(Integer runningTime) {
        this.runningTime = runningTime;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }
}
