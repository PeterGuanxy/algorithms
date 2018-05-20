package _01_Sorting_Basic.other_sort;

/**
 * description  冒泡排序
 *
 * @author guanxy
 * @date 2018/5/15
 */
public class BubbleSort {

  public static void sort(Comparable[] arr) {

    int n = arr.length;
    boolean swapped = false;

    do {
      swapped = false;

      for (int i = 1; i < n; i++) {
        if (arr[i - 1].compareTo(arr[i]) > 0) {
          swap(arr, i - 1, i);
          swapped = true;
        }
      }
      n--;
    } while (swapped);
  }

  private static void swap(Object[] arr, int i, int j) {
    Object t = arr[i];
    arr[i] = arr[j];
    arr[j] = t;
  }
}
