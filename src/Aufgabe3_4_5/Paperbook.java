package Aufgabe3_4_5;

import java.util.Date;

public class Paperbook extends Boook {

    private String series;
    private String month;

    public Paperbook(int pages, String title, String isbn, Date released, String series, String month) {
        super(pages, title, isbn,released);
        this.setSeries(series);
        this.setMonth(month);
    }

    @Override
    public String toString(){

        return String.format(this.getTitle()+" hat "+this.getPages()+" Seiten und folgende ISBN: "+this.getIsbn()+" ist es im Monat "+this.getMonth()+" erschienen. Serie: "+this.getSeries());

    }


    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }
}
