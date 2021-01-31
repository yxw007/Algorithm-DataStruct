//*************************************************************************
//     创建日期:     2021-01-28
//     文件名称:     PACKAGE_NAME.Main.java
//     创建作者:     Harry
//     版权所有:     剑齿虎
//     开发版本:     V1.0
//     相关说明:
//*************************************************************************

import algorithm.ISort;
import algorithm.InsertSort;
import algorithm.SelectSort;
import utils.CheckUtils;
import utils.GenerateUtils;

public class Main {
    //-------------------------------------------------------------------------
    private static void __log(String message) {
        System.out.println(message);
    }

    //-------------------------------------------------------------------------
    private static <T> String __arrayToString(T[] array) {
        StringBuffer builder = new StringBuffer();
        for (T item : array) {
            builder.append(item.toString() + ",");
        }
        return builder.toString();
    }

    //-------------------------------------------------------------------------
    public static <T extends Comparable> void algorithmATest(ISort iSort, T[] array) {
        __log("------------------------------------");
        double now = System.nanoTime();
//        __log(String.format("%s sort B: %s", iSort.getClass().getName(), __arrayToString(array)));
        iSort.sort(array);
//        __log(String.format("%s sort A: %s", iSort.getClass().getName(), __arrayToString(array)));
        double runTime = (System.nanoTime() - now) / 1000000000.0f;
        System.out.println(String.format("%s run %d  use time %f s", iSort.getClass().getName(), array.length, runTime));
    }

    //-------------------------------------------------------------------------
    public static void algorithmALLRandomTest() {
        Integer[] numArr = {10000, 100000};
//      Integer[] numArr = {10};

        for (int num : numArr) {
            Integer[] randomArr = GenerateUtils.generateRandomNumToArr(num, num);
            Integer[] cloneArr = GenerateUtils.cloneArr(randomArr);

            algorithmATest(new SelectSort(), randomArr);
            algorithmATest(new InsertSort(), cloneArr);
        }
    }

    //-------------------------------------------------------------------------
    public static void main(String[] args) {
        algorithmALLRandomTest();
    }
    //-------------------------------------------------------------------------
}
