package de.tum.in.ase.eist;

import java.util.List;

public class LinearSearch {
   public List<Chapter> book;
   public String name;


    public  int performSearch(List<Chapter> book, String name ) {
        for (int i = 0; i < book.size(); i++) {

              if(book.get(i).getName()==name){
                  return  book.get(i).getPageNumber();
              }

        }
        return -1;


    }
}
