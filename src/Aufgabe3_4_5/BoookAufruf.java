package Aufgabe3_4_5;

import java.util.ArrayList;
import java.util.Date;


public class BoookAufruf {
    public static void main(String[] args) {

        Boook myBook = new Boook(200,"My Book","6456-4643643-46464",new Date());
        System.out.println("Das Buch hat "+myBook.getPages()+" Seiten, wurde am "+myBook.getReleased()+" veröffentlicht und hat den Titel "+myBook.getTitle());

        System.out.println("");

        ArrayList<Boook> boooks = new ArrayList<Boook>();
        boooks.add(new Boook(200,"my Book 1","56464-4352345-345435",new Date()));
        boooks.add(new Boook(200,"my Book 2","96464-4352345-345435",new Date()));
        boooks.add(new Boook(200,"my Book 3","86464-4352345-345435",new Date()));
        boooks.add(new Boook(200,"my Book 4","76464-4352345-345435",new Date()));
        boooks.add(new Boook(200,"my Book 5","66464-4352345-345435",new Date()));



        for(Boook t:boooks){
            System.out.println(t);
        }
        System.out.println("");

        ArrayList<Paperbook> paperbookArrayList = new ArrayList<Paperbook>();
        paperbookArrayList.add(new Paperbook(200,"my Paperbook 1","5465464-546456-56464",new Date(),"1","Juni"));
        paperbookArrayList.add(new Paperbook(200,"my Paperbook 2","5465464-546456-56464",new Date(),"2","September"));
        paperbookArrayList.add(new Paperbook(200,"my Paperbook 3","5465464-546456-56464",new Date(),"3","Mai"));
        paperbookArrayList.add(new Paperbook(200,"my Paperbook 4","5465464-546456-56464",new Date(),"4","Februar"));
        paperbookArrayList.add(new Paperbook(200,"my Paperbook 5","5465464-546456-56464",new Date(),"5","August"));

        for (Paperbook g:paperbookArrayList) {
            System.out.println(g);
        }
    }
}
