package Aufgabe3_4_5;

import java.util.Date;

public class Boook  {

    private int pages;
    private String title;
    private String isbn;
    private Date released;

    public Boook(int pages, String title, String isbn, Date released) {
        this.pages = pages;
        this.title = title;
        this.isbn = isbn;
        this.setReleased(released);
    }

    @Override
    public String toString(){

        return String.format(this.getTitle()+" hat "+this.getPages()+" Seiten und folgende ISBN: "+this.getIsbn());

    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Date getReleased() {
        return released;
    }

    public void setReleased(Date released) {
        this.released = released;
    }
}


