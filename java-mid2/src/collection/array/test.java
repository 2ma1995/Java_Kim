package collection.array;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        int[] arr = {5,2,8,1,9};
        for (int i = 0; i < arr.length-1; i++) {
            System.out.println(arr[i]);
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.println("Step " + (i+1) + ": " + Arrays.toString(arr));
        }

    }
}
