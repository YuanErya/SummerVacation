package LostAndFind;

import java.util.Date;

public class CardLost extends Lost{
    private String kind="Card";
    public CardLost(String name, Date date){
        super(name,date);
    }

}
