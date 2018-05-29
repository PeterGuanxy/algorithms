package _02_Sorting_Advance._03_Merge_Sort_Bottom_Up;

import java.util.Arrays;

/**
 * description
 *
 * @author guanxy
 * @date 2018/5/30
 */
public class Main {

  // 比较Merge Sort和Merge Sort Bottom Up两种排序算法的性能效率
  // 整体而言, 两种算法的效率是差不多的。但是如果进行仔细测试, 自底向上的归并排序会略胜一筹。
  public static void main(String[] args) {

    int N = 1000000;

    // 测试1 一般测试
    System.out.println("Test for random array, size = " + N + " , random range [0, " + N + "]");

    Integer[] arr1 = SortTestHelper.generateRandomArray(N, 0, N);
    Integer[] arr2 = Arrays.copyOf(arr1, arr1.length);

    SortTestHelper.testSort("_02_Sorting_Advance._03_Merge_Sort_Bottom_Up.MergeSort", arr1);
    SortTestHelper.testSort("_02_Sorting_Advance._03_Merge_Sort_Bottom_Up.MergeSortBU", arr2);

    System.out.println();


    // 测试2 测试近乎有序的数组
    int swapTimes = 10;
    assert swapTimes >= 0;

    System.out.println("Test for nearly ordered array, size = " + N + " , swap time = " + swapTimes);

    arr1 = SortTestHelper.generateNearlyOrderedArray(N, swapTimes);
    arr2 = Arrays.copyOf(arr1, arr1.length);

    SortTestHelper.testSort("_02_Sorting_Advance._03_Merge_Sort_Bottom_Up.MergeSort", arr1);
    SortTestHelper.testSort("_02_Sorting_Advance._03_Merge_Sort_Bottom_Up.MergeSortBU", arr2);

    return;
  }
}
