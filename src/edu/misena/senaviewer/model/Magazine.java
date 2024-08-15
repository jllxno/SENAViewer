package edu.misena.senaviewer.model;

import java.util.List;

public class Magazine {
    private int id;
    private String title;
    private date editionDate;
    private String editorial;
    private String authors;

    public Magazine(String title, String genre, int duration) {
        this.title = title;
        this.editionDate = editionDate;
        this.editorial = editorial;

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


    public date getEditionDate() {
        return editionDate;
    }

    public void setEditionDate(date editionDate) {
        this.editionDate = editionDate;
    }


    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }



    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

}

