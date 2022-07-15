package LostAndFind;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Lost {
    DateFormat time=new SimpleDateFormat("yyyy.MM.dd");
    protected  String name;
    protected Date tim;//丢失时间

    public Lost(String name, Date date) {
        this.name = name;
        this.tim = date;
    }
}
