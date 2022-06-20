package de.tum.in.ase.eist;

import java.util.List;

public class Context {
    private List<Chapter> book;
    private SearchStrategy searchAlgorithm;


    public Context(List<Chapter> book) {
        this.book = book;
    }

    public List<Chapter> getBook() {
        return book;
    }

    public void setBook(List<Chapter> book) {
        this.book = book;
    }

    public boolean isChaptersSortedByName() {

        for (int i = 0; i < book.size(); i++) {
            for (int j = i + 1; j < book.size(); j++) {
                if (book.get(i).getName().compareTo(book.get(j).getName()) > 0) {
                    return false;
                }

            }

        }
        return true;
    }
}
