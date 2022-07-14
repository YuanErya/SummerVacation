package LostAndFind;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Solution {

    //按时间排序
    public void sortLost(Lost[] array){
        int len = array.length;
        int  gap = len / 2;
        Lost temp;
        while (gap > 0) {
            for (int i = gap; i < len; i++) {
                temp = array[i];
                int preIndex = i - gap;
                while (preIndex >= 0 && array[preIndex].tim.after(temp.tim)) {
                    array[preIndex + gap] = array[preIndex];
                    preIndex -= gap;
                }
                array[preIndex + gap] = temp;
            }
            gap /= 2;
        }

    }


    //文字检索功能
    public Lost[] selectByKeyword(Lost[] lostArray,String keyword){
        Lost[] reLostArray = new Lost[lostArray.length];
        int j=0;
        for (int i = 0; i <lostArray.length ; i++) {
            if(lostArray[i].name.lastIndexOf(keyword)!=-1){
                reLostArray[j]=lostArray[i];
                j++;
            }
        }
        return reLostArray;
    }


    //输出功能
    public void print(Lost[] array){
        DateFormat time=new SimpleDateFormat("yyyy.MM.dd");//设置录入时间的格式
        for (int i = 0; i <array.length ; i++) {
            if(array[i]!=null){
                System.out.println(array[i].name+"  "+time.format(array[i].tim));
            }
        }
        System.out.println("当前数据已显示完毕！");
        System.out.println("");
    }
}



