//*************************************************************************
//     创建日期:     2021-01-31
//     文件名称:     algorithm/InsertSort.java
//     创建作者:     Harry
//     开发版本:     V1.0
//     相关说明:
//*************************************************************************

package algorithm;

public class InsertSort implements ISort {

    @Override
    public <T extends Comparable> void sort(T[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j].compareTo(arr[j - 1]) < 0) {
                    T temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                } else {
                    break;
                }
            }
        }
    }
}
