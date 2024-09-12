package edu.misena.senaviewer.model;

import java.util.List;

public class Book extends publication {
    public int id;
    public String title;
    public String editionDate;
    public String editorial;
    public String authors;
    public String isbn;
    public boolean readed;
    public int timeReaded;


    public Book(String title, String editionDate, String editorial) {
        super(title, editionDate, editorial);

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


    public String getEditionDate() {
        return editionDate;
    }

    public void setEditionDate(String editionDate) {
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


    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }


    public boolean isReaded() {
        return readed;
    }

    public void setReaded(boolean readed) {
        this.readed = readed;
    }

    public int getTimeReaded() {
        return timeReaded;
    }

    public void setTimeReaded(int timeReaded) {
        this.timeReaded = timeReaded;
    }

@Override
public String toString(){
    return "serie{" +
            super.toString()+
            ", id=" + id +
            ", title=" + title +
            ", editionDate=" + editionDate +
            ", editorial=" + editorial +
            ", authors=" + authors +
            '}';




}}