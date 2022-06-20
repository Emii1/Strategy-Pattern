package de.tum.in.ase.eist;

import java.util.List;
import java.util.Objects;

public class LinearSearch implements SearchStrategy{
   public List<Chapter> book;
   public String name;


    public  int performSearch(List<Chapter> book, String name ) {
        for (int i = 0; i < book.size(); i++) {

              if(Objects.equals(book.get(i).getName(), name)){
                  return  book.get(i).getPageNumber();
              }

        }
        return -1;


    }
}
