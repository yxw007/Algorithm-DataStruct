//*************************************************************************
//     创建日期:     2021-01-31
//     文件名称:     algorithm/SelectSort.java
//     创建作者:     Harry
//     开发版本:     V1.0
//     相关说明:
//*************************************************************************

package algorithm;

public class SelectSort implements ISort {

    @Override
    public <T extends Comparable> void sort(T[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minIdx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j].compareTo(arr[minIdx]) < 0) {
                    minIdx = j;
                }
            }
            if (arr[minIdx].compareTo(arr[i]) < 0) {
                T temp = arr[i];
                arr[i] = arr[minIdx];
                arr[minIdx] = temp;
            }
        }
    }
}
