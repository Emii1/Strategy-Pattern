package de.tum.in.ase.eist;

import java.util.Iterator;
import java.util.List;

public class Context {
    private List<Chapter> book;
    private SearchStrategy searchAlgorithm;


    public SearchStrategy getSearchAlgorithm() {
        return searchAlgorithm;
    }

    public void setSearchAlgorithm(SearchStrategy searchAlgorithm) {
        this.searchAlgorithm = searchAlgorithm;
    }

    public List<Chapter> getBook() {
        return book;
    }

    public void setBook(List<Chapter> book) {
        this.book = book;
    }

    public boolean isChaptersSortedByName() {


        Iterator<Chapter> iter = book.iterator();
        Chapter current;
        Chapter previous = iter.next();
        while (iter.hasNext()) {
            current = iter.next();
            if (previous.getName().compareTo(current.getName()) > 0) {
                return false;
            }

        }
        return true;

    }

    public int search(String name) {
        return searchAlgorithm.performSearch(book, name);
    }


}
