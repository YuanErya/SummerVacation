package LostAndFind;

import java.awt.print.Book;
import java.util.Date;

public class BookLost extends Lost {
    private String kind="Book";
    public BookLost(String name, Date date){
        super(name,date);
    }
}
