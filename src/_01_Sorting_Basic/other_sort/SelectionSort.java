package _01_Sorting_Basic.other_sort;


import _01_Sorting_Basic.selection_sort_detect_performance.SortTestHelper;

/**
 * description  测试用例
 *
 * @author guanxy
 * @date 2018/5/8
 */
public class SelectionSort {

  public static void sort(Comparable[] arr) {

    int n = arr.length;
    for (int i = 0; i < n; i++) {
      int minIndex = i;
      for (int j = i + 1; j < n; j++) {
        if (arr[j].compareTo(arr[minIndex]) < 0) {
          minIndex = j;
        }
      }
      swap(arr, i, minIndex);
    }
  }

  private static void swap(Object[] arr, int i, int j) {
    Object t = arr[i];
    arr[i] = arr[j];
    arr[j] = t;
  }

  public static void main(String[] args) {
    int n = 100000;
    Integer[] arr = SortTestHelper.generateRandomArray(n, 0, 100000);
    SortTestHelper.testSort("_01_Sorting_Basic.other_sort.SelectionSort", arr);
  }
}
