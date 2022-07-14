package LostAndFind;

import java.util.Date;

public class CardLost extends Lost{
    private String kind="Card";
    private String stName;//持卡人姓名

    public CardLost(String name, Date date,String name2){
        super(name,date);
        this.stName = name2;
    }

}
