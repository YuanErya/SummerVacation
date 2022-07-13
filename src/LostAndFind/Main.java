package LostAndFind;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) throws ParseException {
        DateFormat time=new SimpleDateFormat("yyyy.MM.dd");//设置录入时间的格式
         Lost l1=new CardLost("挪威深林",time.parse("2020.7.1"));


    }
}
