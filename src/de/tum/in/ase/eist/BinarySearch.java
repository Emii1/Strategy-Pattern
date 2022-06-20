package de.tum.in.ase.eist;

import java.util.List;
import java.util.Objects;

public class BinarySearch implements SearchStrategy {


    public int performSearch(List<Chapter> book, String name) {
        for (Chapter chapter : book) {

            if (Objects.equals(chapter.getName(), name)) {
                return chapter.getPageNumber();
            }

        }
        return -1;


    }
}
