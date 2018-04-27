package Sorting_Basic.insertion_sort;

import Sorting_Basic.selection_sort_detect_performance.SortTestHelper;

import java.util.Arrays;

/**
 * description
 *
 * @author guanxy
 * @date 2018/4/28
 */
public class InsertionSort {

  public static void sort(Comparable[] arr) {
    int n = arr.length;

    for (int i = 0; i < n; i++) {
      for (int j = i; j > 0 && arr[j].compareTo(arr[j - 1]) < 0; j--) {
        swap(arr,j,j-1);
      }
    }
  }

  private static void swap(Object[] arr, int i, int j) {
    Object t = arr[i];
    arr[i] = arr[j];
    arr[j] = t;
  }

  public static void main(String[] args) {
    int N = 80000;
    Integer[] arr = SortTestHelper.generateRandomArray(N,0,10000);
    Integer[] arr2 = Arrays.copyOf(arr,arr.length);

    SortTestHelper.testSort("Sorting_Basic.insertion_sort.InsertionSort",arr);
    SortTestHelper.testSort("Sorting_Basic.selection_sort_detect_performance.SelectionSort",arr2);


  }

}
