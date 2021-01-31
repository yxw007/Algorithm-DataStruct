//*************************************************************************
//     创建日期:     2021-01-31
//     文件名称:     algorithm/ISort.java
//     创建作者:     Harry
//     开发版本:     V1.0
//     相关说明:
//*************************************************************************
package algorithm;

public interface ISort {
    <T extends Comparable> void sort(T[] array);
}
