package MergingArrays;

import java.util.Arrays;

public class MainClass {
    public static void main(String[] args) {
        int[] arr1 = UtilityClass.MyArray();
        int[] arr2 = UtilityClass.MyArray();

        int[] merge = MergingMethod.merge(arr1, arr2);
        Arrays.sort(merge);
        System.out.println("Merged array elements: " + Arrays.toString(merge));
    }
}
