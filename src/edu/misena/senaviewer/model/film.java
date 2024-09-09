package edu.misena.senaviewer.model;

public class film {
    private int id;
    private String title;
    private String genre;
    private String creator;
    private int duration;
    private int year;
    private boolean viewed;


    public film (String title, String genre, String creator, int duration) {
        this.title = title;
        this.genre = genre;
        this.creator = creator;
        this.duration = duration;
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
    }

