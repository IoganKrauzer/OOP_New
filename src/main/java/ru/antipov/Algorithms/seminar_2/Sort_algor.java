package ru.antipov.Algorithms.seminar_2;

import java.util.Random;

public class Sort_algor {
    static Random random = new Random();

    public static void main(String[] args) {

        int[] arr = fillArray();
        showArray(arr);
//        sortByChoices(arr);
        System.out.println();
        quickSort(arr);
        showArray(arr);

    }

    public static int[] fillArray() {
//        int[] arr = new int[random.nextInt(5, 10)];
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(-30, 31);
        }
        return arr;
    }

    static void showArray(int[] arr) {

        for (int i : arr) {
            System.out.print(i + "\t");
        }
    }

    /**
     * Сортировка выбором:
     */
    static void sortByChoices(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int indexMin = i;
            for (int k = i + 1; k < arr.length; k++) {
                if (arr[indexMin] > arr[k]) {
                    indexMin = k;
                }
            }
            if (i != indexMin) {
                int tmp = arr[i];
                arr[i] = arr[indexMin];
                arr[indexMin] = tmp;
            }
        }
    }

    /**
     * Quicksort сортировка
     */

    public static void quickSort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);

    }

    public static void quickSort(int[] arr, int start, int end) {
        int left = start;
        int right = end;
        int middle = arr[(start + end) / 2];

        do {
            while (arr[left] < middle) {
                left++;
            }
            while (arr[right] > middle) {
                right--;
            }
            if (left <= right) {
                if (left < right) {
                    int tmp = arr[left];
                    arr[left] = arr[right];
                    arr[right] = tmp;
                }
                left++;
                right--;
            }
        }
        while (left <= right);

        if (left < end) {
            quickSort(arr, left, end);
        }
        if (start < right) {
            quickSort(arr, start, right);
        }
    }

}
