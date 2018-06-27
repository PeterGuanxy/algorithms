package _02_Sorting_Advance._04_Quick_Sort;

import java.util.Arrays;

/**
 * description
 *
 * @author guanxy
 * @date 2018/6/28
 */
public class Main {

  public static void main(String[] args) {

    int N = 100000;

    // 测试1 一般性能测试
    System.out.println("Test for random array , size = " + N + ", random range [0, " + N + "]");

    Integer[] arr1 = SortTestHelper.generateRandomArray(N, 0, N);
    Integer[] arr2 = Arrays.copyOf(arr1, arr1.length);

    SortTestHelper.testSort("_02_Sorting_Advance._04_Quick_Sort.MergeSort", arr1);
    SortTestHelper.testSort("_02_Sorting_Advance._04_Quick_Sort.QuickSort", arr2);

    System.out.println("----------------------------------------");

    // 测试2 测试近乎有序的数组
    // 但是对于近乎有序的数组，快速排序算法退化成了O(n^2)级别的算法

    int swapTimes = 100;
    assert swapTimes >= 0;

    System.out.println("Test for nearly ordered array , size = " + N + ", swap time = " + swapTimes);

    arr1 = SortTestHelper.generateNearlyOrderedArray(N, swapTimes);
    arr2 = Arrays.copyOf(arr1, arr1.length);

    SortTestHelper.testSort("_02_Sorting_Advance._04_Quick_Sort.MergeSort", arr1);
    SortTestHelper.testSort("_02_Sorting_Advance._04_Quick_Sort.QuickSort", arr2);

    return;
  }
}
