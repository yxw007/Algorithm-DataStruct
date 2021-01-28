//*************************************************************************
//     创建日期:     2021-01-28
//     文件名称:     PACKAGE_NAME.Main.java
//     创建作者:     Harry
//     版权所有:     剑齿虎
//     开发版本:     V1.0
//     相关说明:
//*************************************************************************

import java.util.Random;

public class Main {

    public static int[] generateRandomArr(int num, int max) {
        int[] result = new int[num];
        Random random = new Random();
        for (int i = 0; i < result.length; i++) {
            result[i] = random.nextInt(max);
        }
        return result;
    }

    public static boolean isSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] > arr[i]) {
                return false;
            }
        }
        return true;
    }

    public static void selectSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minIdx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            if (arr[minIdx] < arr[i]) {
                int temp = arr[i];
                arr[i] = arr[minIdx];
                arr[minIdx] = temp;
            }
        }
    }

    public static void insertSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                } else {
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] numArr = {10000, 100000};
        for (int num : numArr) {
            double now = System.nanoTime();
            int[] randomArr = generateRandomArr(num, num);
            selectSort(randomArr);
//           insertSort(randomArr);
            double runTime = (System.nanoTime() - now) / 1000000000.0f;

            System.out.println(String.format("run %d  use time %f s", num, runTime));

            if (!isSort(randomArr)) {
                throw new RuntimeException("算法有问题");
            }
        }
    }
}
