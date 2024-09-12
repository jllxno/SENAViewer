package edu.misena.senaviewer.model;

public class Serie extends film {
    public int id;
    public String title;
    public String genre;
    public String creator;
    public int duration;
    public int year;
    public boolean viewed;
    public int timeViewed;
    public int sessionQuantity;


    public Serie(String title, String genre,String creator, int duration) {
        super(title, genre, creator, duration);
        this.year= year;
        this.viewed= viewed;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }


    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }


    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }


    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


    public boolean isViewed() {
        return viewed;
    }

    public void setViewed(boolean viewed) {
        this.viewed = viewed;
    }


    public int getTimeViewed() {
        return timeViewed;
    }

    public void setTimeViewed(int timeViewed) {
        this.timeViewed = timeViewed;
    }


    public int getSessionQuantity() {
        return sessionQuantity;
    }

    public void setSessionQuantity(int sessionQuantity) {
        this.sessionQuantity = sessionQuantity;
    }


@Override
public String toString(){
    return "serie{" +
            super.toString()+
            ", id=" + id +
            ", title=" + title +
            ", editionDate=" + genre +
            ", editorial=" + creator +
            ", authors=" + duration +
            ", editionDate=" + year +
            ", editorial=" + viewed +
            ", authors=" + timeViewed +
            '}';




}}