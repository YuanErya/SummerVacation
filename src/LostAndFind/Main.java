package LostAndFind;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) throws ParseException {
       Solution s=new Solution();//创建用于调用方法的对象
        DateFormat time=new SimpleDateFormat("yyyy.MM.dd");//设置录入时间的格式

        //随便创建的测试数据
        Lost []lostArray=new Lost[5];
        lostArray[0]=new CardLost("身份证",time.parse("2022.5.9"),"张三");
        lostArray[1]=new BookLost("挪威森林",time.parse("2021.12.7"));
        lostArray[2]=new Lost("钥匙",time.parse("2022.7.15"));
        lostArray[3]=new BookLost("java核心技术卷1",time.parse("2022.7.4"));
        lostArray[4]=new CardLost("学生证",time.parse("2022.7.2"),"李四");

        //测试排序功能
        s.sortLost(lostArray);//调用排序
        s.print(lostArray);//输出排序结果

        //测试检索功能
        Lost[] re=s.selectByKeyword(lostArray,"证");//调用检索功能
        s.print(re);//输出检索结果

    }
}
