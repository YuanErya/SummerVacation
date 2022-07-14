package LostAndFind;

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

        return reLostArray;
    }
}
