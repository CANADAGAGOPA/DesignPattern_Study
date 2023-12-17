package DP08_TemplateMethodPattern.SortTrest;

import java.util.Arrays;

public class SortTest {
    public static void main(String[] args) {
        int[] arr = {54, 34, 15, 77, 67};

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        Arrays.sort(arr); // sort 는 템플릿 메소드 형식

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
