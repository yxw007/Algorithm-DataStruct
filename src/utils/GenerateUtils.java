//*************************************************************************
//     创建日期:     2021-01-31
//     文件名称:     utils.GenerateUtils.java
//     创建作者:     Harry
//     版权所有:     剑齿虎
//     开发版本:     V1.0
//     相关说明:
//*************************************************************************

package utils;

import java.util.Random;

public class GenerateUtils {
    private static Random m_random = new Random();

    //-------------------------------------------------------------------------
    private GenerateUtils() {

    }

    //-------------------------------------------------------------------------
    public static Integer[] generateRandomNumToArr(int num, int randomMax) {
        Integer[] array = new Integer[num];

        for (int i = 0; i < array.length; i++) {
            array[i] = m_random.nextInt(randomMax);
        }
        return array;
    }

    public static Integer[] cloneArr(Integer[] array) {
        Integer[] cloneArr = new Integer[array.length];

        for (int i = 0; i < array.length; i++) {
            cloneArr[i] = array[i];
        }

        return cloneArr;
    }

    //-------------------------------------------------------------------------
    public static Integer[] generateNumToArr(int num) {
        Integer[] array = new Integer[num];

        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }

        return array;
    }
    //-------------------------------------------------------------------------
}
